package com.scm.actions;

import org.apache.struts2.interceptor.validation.SkipValidation;
import org.hibernate.internal.util.StringHelper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.scm.dao.domain.SystemUser;
import com.scm.modal.UserBean;
import com.scm.util.DesEncrypter;

@Controller("loginAction")
@Scope("prototype")
public class LoginAction extends SCMAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6402907660493973555L;
	private String email;
	private String password;

	private String maaaNumber;
	private String firstName;
	private String lastName;
	private String cellphone;
	private String identificationNumber;
	private String confirmPassword;
	private boolean sessionExpired;
	
	private String noLoad = "";

	@SkipValidation
	public String execute() {
		return SUCCESS;
	}

	@SkipValidation
	public String goRegister() {
		logger.debug("Hi I'm in goRegister...");
		return SUCCESS;
	}

	public String saveSupplierDetails() {
		logger.debug("Hi I'm in saveSupplierDetails...");
		try {
			if(StringHelper.isNotEmpty(password) && StringHelper.isNotEmpty(confirmPassword) && !password.equals(confirmPassword)) {
				addActionError(getText("password.confirmpassword.mismatch"));
			}
			String exists = serviceManager.getUserUIService().checkUserValueExists(email, "email");

			if (exists != null && exists.equalsIgnoreCase("Exists")) {
				noLoad = "clear";
				addActionError("Email is already in use. Please use another email.");
				return ERROR;
			}

			exists = serviceManager.getUserUIService().checkUserValueExists(maaaNumber, "maaaNumber");

			if (exists != null && exists.equalsIgnoreCase("Exists")) {
				noLoad = "clear";
				addActionError("MAAA number is already in use. Please use another MAAA number.");
				return ERROR;
			}

			exists = serviceManager.getUserUIService().checkUserValueExists(identificationNumber,
					"identificationNumber");

			if (exists != null && exists.equalsIgnoreCase("Exists")) {
				noLoad = "clear";
				addActionError("Identification number is already in use. Please use another Identification number.");
				return ERROR;
			}

			String validMaaaNumber = serviceManager.getUserUIService().validateMaaaNumber(maaaNumber);

			if (validMaaaNumber != null && validMaaaNumber.equalsIgnoreCase("error")) {
				noLoad = "clear";
				addActionError("CSD MAAA number is invalid. Please register on {{TreasuryLink}}.");
				return ERROR;
			}

			boolean isCSDActive = serviceManager.getUserUIService().isCSDActive(maaaNumber);

			if (!isCSDActive) {
				noLoad = "clear";
				addActionError(
						"Supplier that you are trying to register is NOT ACTIVE on CSD , please update your CSD status and then retry the registration process");
				return ERROR;
			}
			
			UserBean systemUser = new UserBean();
			systemUser.setEmail(email);
			systemUser.setMaaaNumber(maaaNumber);
			systemUser.setFirstName(firstName);
			systemUser.setLastName(lastName);
			systemUser.setMobileNumber(cellphone);
			systemUser.setIdentificationNumber(identificationNumber);
			systemUser.setPassword(DesEncrypter.encrypt(password));
			
			
			serviceManager.getUserUIService().registerSupplier(systemUser);
			
			
			SystemUser sysUser = serviceManager.getUserUIService().getUserDetailsBy(email, password);
			
			ActionContext.getContext().getSession().put("SESSION_USER_ID", sysUser.getId());
			ActionContext.getContext().getSession().put("SESSION_USER_NAME", email);
			ActionContext.getContext().getSession().put("SESSION_USER_MAAANUMBER", sysUser.getMaaaNumber());
			ActionContext.getContext().getSession().put("SESSION_USER_ROLE", "Supplier");
			ActionContext.getContext().getSession().put("FROM_REGISTRATION", "true");
			
			
		} catch (Throwable th) {
			noLoad = "clear";
			addActionError(
					"Error while saving supplier details...");
			th.printStackTrace();
		}
		return SUCCESS;
	}

	@SkipValidation
	public String login() {
		logger.debug("Hi I'm in login...");
		try {
			SystemUser sysUser = serviceManager.getUserUIService().getUserDetailsBy(email, DesEncrypter.decrypt(password));

			if (sysUser != null) {
				if (sysUser.getIsLocked()) {
					return "lockout";
				}
				ActionContext.getContext().getSession().put("SESSION_USER_ID", sysUser.getId());
				ActionContext.getContext().getSession().put("SESSION_USER_NAME", email);
				ActionContext.getContext().getSession().put("SESSION_USER_MAAANUMBER", sysUser.getMaaaNumber());

				// TODO save to system log

				String roleName = serviceManager.getUserUIService().getUserRole(sysUser.getId());
				ActionContext.getContext().getSession().put("SESSION_USER_ROLE", roleName);
			} else {
				logger.error("Invalid login attempt for user: ", email);
				addActionError("Invalid login attempt.");
				return ERROR;
			}
		} catch (Throwable th) {
			th.printStackTrace();
			logger.error("Invalid login attempt for user: "+email, th);
			addActionError("Invalid login attempt.");
			return ERROR;
		}
		return SUCCESS;
	}

	@SkipValidation
	public String exitApplication() {
		logger.debug("In exitApplication...");
		try {
			// TOD save to SystemLog table if not session expire...
		sessionCtx = request.getSession(false);
		sessionCtx.invalidate();
		}catch(Throwable th) {
			th.printStackTrace();
		}
		return SUCCESS;
	}
	
	@RequiredStringValidator(type = ValidatorType.SIMPLE, message = "", key = "email.required", shortCircuit = true)
	@EmailValidator(type = ValidatorType.SIMPLE, message = "Please enter a valid email address", key = "email.validate", fieldName = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@RequiredStringValidator(type = ValidatorType.SIMPLE, message = "", key = "password.required", shortCircuit = true)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMaaaNumber() {
		return maaaNumber;
	}

	public void setMaaaNumber(String maaaNumber) {
		this.maaaNumber = maaaNumber;
	}

	@RequiredStringValidator(type = ValidatorType.SIMPLE, message = "", key = "firstname.required", shortCircuit = true)
	@RegexFieldValidator(type = ValidatorType.SIMPLE, message = "", regexExpression = "^[a-zA-Z ]+{3,30}$", key = "firstname.validate", shortCircuit = true)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@RequiredStringValidator(type = ValidatorType.SIMPLE, message = "", key = "lastname.required", shortCircuit = true)
	@RegexFieldValidator(type = ValidatorType.SIMPLE, message = "", regexExpression = "^[a-zA-Z0-9_ ]*{3,30}$", key = "lastname.validate", shortCircuit = true)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@RegexFieldValidator(type = ValidatorType.SIMPLE, regex = "\\d{10,10}", key = "phoneNumber.validate", message = "Please enter a valid contact number that is 10 characters in length", shortCircuit = true)
	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	@StringLengthFieldValidator(type = ValidatorType.SIMPLE, minLength = "0", maxLength = "13", key = "identificationNumber.validate", message = "Please enter a valid identification number that is 13 characters in length", shortCircuit = true)
	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	@RequiredStringValidator(type = ValidatorType.SIMPLE, message = "", key = "password.confirmpassword.mismatch", shortCircuit = true)
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getNoLoad() {
		return noLoad;
	}

	public void setNoLoad(String noLoad) {
		this.noLoad = noLoad;
	}

	public boolean isSessionExpired() {
		return sessionExpired;
	}

	public void setSessionExpired(boolean sessionExpired) {
		this.sessionExpired = sessionExpired;
	}

}
