use CatenaQb_New;
CREATE TABLE [dbo].[ApplicationRoles] (
    ID int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    RoleName varchar(255) NOT NULL
);

INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Contracts Management: Senior Specialist');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Supplier Database: Specialist');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Supplier Management: Senior Specialist');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Contracts Management: Specialist');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Supplier Development: Specialist');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Legal');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Commodities: Specialist');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Clerk');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Commodities: Category Manager');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Admin');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Supplier');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('SCM Governance');
INSERT [dbo].[ApplicationRoles] ([RoleName]) values('Super Admin');



CREATE TABLE [dbo].[ApplicationUserRoles] (
	ID int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    RoleId int NOT NULL,
    SystemUserId bigint NOT NULL,
    FOREIGN KEY (RoleId) REFERENCES ApplicationRoles(Id),
    FOREIGN KEY (SystemUserId) REFERENCES SystemUsers(Id)
);

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Contracts Management: Senior Specialist' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Supplier Database: Specialist' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Supplier Management: Senior Specialist' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Contracts Management: Specialist' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Supplier Development: Specialist' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Legal' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Commodities: Specialist' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Clerk' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Commodities: Category Manager' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Admin' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Supplier' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='SCM Governance' and ar.rolename=r.name;

insert into [dbo].[ApplicationUserRoles]  select ar.id, au.systemuserid from aspnetusers au, aspnetuserroles aur, aspnetroles r, applicationroles ar
where au.id=aur.userid and aur.roleid=r.id and r.name='Super Admin' and ar.rolename=r.name;



alter table systemusers add Password varchar(255) ;

update systemusers set Password='BVMLw1ydOkJiyKC85n33Ww==';
