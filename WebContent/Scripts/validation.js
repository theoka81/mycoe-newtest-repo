


var $inputWrapper = '.input-wrap',
	$invalidClass = 'is-invalid',
	$validClass = 'is-valid',
	$optionalClass = 'is-optional',
	$requiredClass = 'is-required',
	$helperClass = '.is-helpful',
	$errorClass = 'error-message',

	$validEmail = /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,13}$/i,
	$validWebsite = /^[A-Z._-]+.[A-Z0-9.-]+\.[A-Z]{2,13}$/i,
	$validPhone = /^[0-9-.()]{3,15}$/,

	$date = new Date();



function markValid(field) {
	var $field_wrapper = field.parents($inputWrapper);

	$field_wrapper.addClass($validClass).removeClass($invalidClass);

	$(field).parents($inputWrapper).siblings('.error-message').slideUp(200, function () {
		$(this).addClass('hide');
	});

	field.parents($inputWrapper).siblings($helperClass).removeClass($errorClass);
	field.parents($inputWrapper).siblings('.error-message').removeClass($errorClass);

	setIcon(field, 'valid');
	setField(field, $field_wrapper, 'valid');
	helperUp(field);
}

function markInvalid(field, error_message) {
	var $field_wrapper = field.parents($inputWrapper);

	if ($field_wrapper.hasClass($requiredClass) || ($field_wrapper.hasClass($optionalClass) && field.val() !== '')) {
		setIcon(field, 'invalid');
		setError(field, error_message);
		setField(field, $field_wrapper, 'invalid');
	}
}

function markNeutral(field) {
	$(field).closest($inputWrapper).addClass($validClass).removeClass($invalidClass);
	$('label[for="' + field.attr('id') + '"]').addClass($validClass).removeClass($invalidClass);
	$(field).siblings('.icon.success').removeClass('show').addClass('hide');
	$(field).siblings('.icon.error').removeClass('show').addClass('hide');
}

function setIcon(field, validation_type) {
	var $iconSuccess = $(field).siblings('.icon.success');
	var $iconError = $(field).siblings('.icon.error');

	if (validation_type === 'valid') {
		$iconSuccess.removeClass('hide');
		$iconError.addClass('hide');
	} else if (validation_type === 'invalid') {
		$iconSuccess.addClass('hide');
		$iconError.removeClass('hide');
	}
}


function setIconMulti(iconSuccess, iconError, validation_type) {
	if (validation_type === 'valid') {
		iconSuccess.removeClass('hide');
		iconError.addClass('hide');
	} else if (validation_type === 'invalid') {
		iconSuccess.addClass('hide');
		iconError.removeClass('hide');
	}
}

function setError(field, error_message) {
	field.closest($inputWrapper).siblings($helperClass).html(error_message);
	field.closest($inputWrapper).siblings($helperClass).addClass('error-message').removeClass('hide');
}

function setField(field, field_wrapper, validation_type) {
	if (validation_type === 'valid') {
		field_wrapper.addClass($validClass).removeClass($invalidClass);
		field_wrapper.siblings('label').addClass($validClass).removeClass($invalidClass);
	} else if (validation_type === 'invalid') {
		field_wrapper.addClass($invalidClass).removeClass($validClass);
		field_wrapper.siblings('label').addClass($invalidClass).removeClass($validClass);
	}
}

function checkPasswordRequirements(input, event) {
	var errors = 4;

	if (input.val().match(/[a-z]/) !== null) {
		errors--;
		$('.help_text_pwd1').addClass('success');
	} else if (input.val().match(/[a-z]/) === null) {
		errors++;
		$('.help_text_pwd1').removeClass('success');
	}

	if (input.val().match(/[A-Z]/) !== null) {
		errors--;
		$('.help_text_pwd2').addClass('success');
	} else if (input.val().toLowerCase() === input.val()) {
		errors++;
		$('.help_text_pwd2').removeClass('success');
	}

	if (input.val().match(/[0-9]/) !== null) {
		errors--;
		$('.help_text_pwd3').addClass('success');
	} else if (input.val().match(/[0-9]/) === null) {
		errors++;
		$('.help_text_pwd3').removeClass('success');
	}

	if (input.val().length >= 8) {
		errors--;
		$('.help_text_pwd4').addClass('success');
	} else if (input.val().length < 8) {
		errors++;
		$('.help_text_pwd4').removeClass('success');
	}

	if (errors > 0) {
		if (event.type === 'blur') {
			markInvalid(input, 'Please choose a valid password.');
		}
	} else if (errors <= 0) {
		markValid(input);
	}
}

function validatePasswordPair(first, second) {
	if (first.val() === second.val()) {
		markValid(second);
	} else {
		if (second.val().length >= 8) {
			markInvalid(second, 'Both passwords must match.');
		}
	}
}



function helperDown(field, help_div, message) {
	help_div.html(message);
	help_div.removeClass($errorClass);
	help_div.slideDown(400);
}

function helperUp(field) {
	field.parents($inputWrapper).siblings($helperClass).slideUp(400);
}

function validateNegativeInput(positiveValue , global) {
	if (Math.sign(positiveValue) === 1) {
		markValid(global);
	}
	else {
		if (Math.sign(positiveValue) === -1)
		{
			$Message = 'The value entered cannot be negative please enter a positive value to proceed.';
			markInvalid(global, $Message);
        }
    }
}

function ValidationNumberProcess(fieldID) {

	$(fieldID).on('keyup change', function (event) {

		$Value = $(fieldID).val();
		if ($('.negative').hasClass('is-invalid')) {
			markInvalid($(this));
		}
		else {
			validateNegativeInput($Value, $(this));
		}
	});

	$(fieldID).on('blur', function (event) {
		$Value = $(fieldID).val();

		if ($(this).val().length === 0) {
			markInvalid($(this));
		}
		else {
			validateNegativeInput($Value, $(this));
		}
	});
}


function groupValidation() {

	ValidationNumberProcess('#InventoryDefinition_ItemId');
	ValidationNumberProcess('#InventoryDefinition_ItemDimensionLength');
	ValidationNumberProcess('#InventoryDefinition_ItemDimensionWidth');
	ValidationNumberProcess('#InventoryDefinition_ItemDimensionHeight');
	ValidationNumberProcess('#InventoryDefinition_ItemDimensionVolume');
	ValidationNumberProcess('#InventoryDefinition_DaysShelfLifeDays');
	ValidationNumberProcess('#InventoryDefinition_BuyerNo');
	ValidationNumberProcess('#InventoryDefinition_DrawingNo');
	ValidationNumberProcess('#InventoryDefinition_CarrierNo');

	ValidationNumberProcess('#InventoryWarehouseDefault_LastSupplierNumber');
	ValidationNumberProcess('#InventoryWarehouseDefault_BuyerNumber');
	ValidationNumberProcess('#InventoryWarehouseDefault_ReorderPointInput');
	ValidationNumberProcess('#InventoryWarehouseDefault_ReorderQuantityInput');
	ValidationNumberProcess('#InventoryWarehouseDefault_ReorderQuantityMaximum');
	ValidationNumberProcess('#InventoryWarehouseDefault_ReorderQuantityMinimum');
	ValidationNumberProcess('#InventoryWarehouseDefault_ServiceLevel');
	ValidationNumberProcess('#InventoryWarehouseDefault_SafetyStock');
	ValidationNumberProcess('#InventoryWarehouseDefault_ShelfLifeDays');
	ValidationNumberProcess('#InventoryWarehouseDefault_QualityBatchNo');
	



}

function ContractGroupValidation() {
	ValidationNumberProcess('#UnitAmount');
	ValidationNumberProcess('#ExtendedAmount');
	ValidationNumberProcess('#OpenAmount');

	ValidationNumberProcess('#ContractDetails_LineNo');
}









