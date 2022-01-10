package com.scm.keys;

public class UserCodeIdKeys {

	public static final int WorkflowDefaultAcceptReason = 21501;
    // JK.20200915a - Warehouse code types.
    public static final int WarehouseTypeTank = 22231;

    // JK.20200909a - Standardised code types - roles.
    public static final int SupplierManagementSeniorSpecialist = 21389;
    public static final int ContractManagementSeniorSpecialist = 21386;
    public static final int CommodityManagementSeniorSpecialist = 1227;
    public static final int SupplierDevelopmentSeniorSpecialist = 21390;
    public static final int RequisitionSpecialist = 22337;
    public static final int SupplierRotationPoolSpecialist = 32348;
    public static final int TenderSpecialist = 32369;
    public static final int RequestingDepartmentSpecialist = 63272;
    public static final int RequestingDepartmentSeniorSpecialist = 63259;
    public static final int EPMOSeniorSpecialist = 63273;

    // JK.20200723a - Standardised code types.
    public static final int SupplierStatusPending = 21422;
    public static final int SupplierStatusActive = 21423;
    public static final int SupplierStatusInactive = 21424;
    public static final int SupplierStatusProcurementHold = 21425;
    public static final int SupplierStatusPaymentHold = 21426;

    public static final int InventoryStatusPending = 21427;
    public static final int InventoryStatusActive = 21428;
    public static final int InventoryStatusInactive = 21429;
    public static final int InventoryStatusObsolete = 21430;

    public static final int ContractStatusPending = 21431;
    public static final int ContractStatusActive = 21432;
    public static final int ContractStatusInactive = 21433;
    public static final int ContractStatusExpired = 21434;

    public static final int WorkflowStatusActive = 21435;
    public static final int WorkflowStatusDeactivated = 21436;
    public static final int WorkflowStatusPending = 21441;

    public static final int WarehouseStatusPending = 21437;
    public static final int WarehouseStatusActive = 21438;
    public static final int WarehouseStatusInactive = 21439;
    public static final int WarehouseStatusDeactivated = 21440;

    //Generic status
    public static final int GenericStatusActive = 52531;
    public static final int GenericStatusNew = 52532;
    public static final int GenericStatusRejected = 52533;
    public static final int GenericStatusClosed = 63263;

    //ISA status
    public static final int ISAStatusActive = 63275;
    public static final int ISAStatusNew = 63274;
    public static final int ISAStatusApproved = 63276;
    public static final int ISAStatusRejected = 63277;
    public static final int ISAStatusClosed = 63278;
    public static final int ISAPendingRequestingDepartment = 63279;
    public static final int ISAPendingEPMO = 63280;
    public static final int ISAIssuedToSupplier = 63281;
    public static final int ISASupplierResponded= 63282;

    // Budget Statuses
    public static final int BudgetStatusPartiallyPaid = 83904;
    public static final int BudgetStatusFullyPaid = 83905;
    public static final int BudgetStatusNotPaid = 83906;

    // JK.20200921a - Transaction Types.
    public static final int TransactionType_ContractNonStock = 1241;
    public static final int TransactionType_ContractServices = 1242;
    public static final int TransactionType_ContractStock = 1240;
    public static final int TransactionType_Employee = 1236;
    public static final int TransactionType_InventoryNonStock = 1238;
    public static final int TransactionType_InventoryServices = 1239;
    public static final int TransactionType_InventoryStock = 1237;
    public static final int TransactionType_Vendor = 1235;
    public static final int TransactionType_ContractServiceLevelAgreement = 22305;
    public static final int TransactionType_ContractMemorandumOfUnderstanding = 22306;
    public static final int TransactionType_ContractMemorandumOfAgreement = 22307;
    public static final int TransactionType_ContractProvisionalTransversal = 22308;
    public static final int TransactionType_ContractNationalTransversal = 22309;
    // JK.20201001a - Requisition Transaction Types.
    public static final int TransactionType_Requistion = 22325;
    public static final int TransactionType_PurchaseOrder = 22338;
    public static final int TransactionType_Quotation = 22339;
    public static final int TransactionType_Request = 22341;

    public static final int RequisitionStatusPending = 22326;
    public static final int RequisitionStatusFirstApprovalAccepted = 22327;
    public static final int RequisitionStatusFirstApprovalDenied = 22328;

    //NC.20201217 - Supplier Rotation Pool TransactionType
    public static final int TransactionType_SupplierRotationTemplate = 32345;

    //NC.20201220 - Tender TransactionType
    public static final int TransactionType_Tender = 32366;

    //NC.20210221 - SRO TransactionType
    public static final int TransactionType_SRO = 52530;


    //NC.20210420 - IPW TransactionType
    public static final int TransactionType_IPW = 63262;

    //NC.20210422 - IPW TransactionType
    public static final int TransactionType_MasterAgreement = 63267;

    //NC.20200921 - Contract Details Status Codes
    public static final int ContractDetailsStatusActive = 22231;
    public static final int ContractDetailsInactive = 22232;
    public static final int ContractDetailsDisputed = 22233;

    public static final int ContractDetailsStatusReasonOnHold = 22234;
    public static final int ContractDetailsStatusReasonInProgress = 22235;
    public static final int ContractDetailsStatusReasonAwaitingDetails = 22236;

    // Code to be standardised.
    public static final int ABCCode1MarginInventory_blank = 1121;
    public static final int ABCCode1SalesInventory_blank = 1120;
    public static final int ABCCode3InvestmentInventory_blank = 1122;
    public static final int ABCCodeOverrideIndicator_blank = 1123;
    public static final int ActiveIngredientFlag_blank = 1152;
    public static final int ApprovalTemplateType_TemplateTypeContractNonStock = 1253;
    public static final int ApprovalTemplateType_TemplateTypeContractStock = 1252;
    public static final int ApprovalTemplateType_TemplateTypeEmployee = 1248;
    public static final int ApprovalTemplateType_TemplateTypeInventoryNonStock = 1250;
    public static final int ApprovalTemplateType_TemplateTypeInventoryServices = 1251;
    public static final int ApprovalTemplateType_TemplateTypeInventoryStock = 1249;
    public static final int ApprovalTemplateType_TemplateTypeVendor = 1247;
    public static final int ApprovalUsage_blank = 1266;
    public static final int BackordersAllowedYN_blank = 1116;
    public static final int Bin_blank = 1200;
    public static final int BulkPackedFlag_blank = 1100;
    public static final int CategoryGL_blank = 1072;
    public static final int CheckAvailabilityYN_blank = 1099;
    public static final int City_blank = 1228;
    public static final int Cluster_blank = 1201;
    public static final int Cluster_blank1 = 1203;
    public static final int ClusterId_blank = 1202;
    public static final int CommissionCategory_blank = 1074;
    public static final int CommitmentMethod_blank = 1138;
    public static final int CommitmentSpecificDays_blank = 1139;
    public static final int CommodityClass_blank = 1015;
    public static final int CommodityCode_blank = 1017;
    public static final int CommoditySubClass_blank = 1016;
    public static final int Company_blank1 = 1204;
    public static final int Company_blank2 = 1205;
    public static final int Company_blank3 = 1206;
    public static final int Company_blank4 = 1207;
    public static final int Comparable_blank = 1245;
    public static final int ComponentType_blank = 1110;
    public static final int ContractHeaderType_Agreement = 1002;
    public static final int ContractHeaderType_Contract = 1001;
    public static final int ContractItem_blank = 1115;
    public static final int CoProductsByProductsInt64ermediate_blank = 1136;
    public static final int Country_blank = 1231;
    public static final int CycleCountCategory_blank = 1071;
    public static final int Department_Department1 = 1208;
    public static final int Department_Department2 = 1209;
    public static final int Department_Department3 = 1210;
    public static final int Department_Department4 = 1211;
    public static final int FamilySection_blank = 1012;
    public static final int FIFOProcessing_blank = 1077;
    public static final int FinalStep_FinalStep = 1265;
    public static final int FinalStep_NormalStep = 1264;
    public static final int FromGrade_blank = 1108;
    public static final int FromPotency_blank = 1105;
    public static final int GradePotencyPricing_blank = 1098;
    public static final int GradeControl_blank1 = 1103;
    public static final int GradeControl_blank2 = 1158;
    public static final int Group_FInance = 1221;
    public static final int Group_Operational = 1222;
    public static final int Group_Roads = 1223;
    public static final int Group_SupplyChainManagemnt = 1220;
    public static final int ItemTemperaturePreferred_10 = 1030;
    public static final int ItemTemperaturePreferred_11 = 1031;
    public static final int ItemTemperaturePreferred_12 = 1032;
    public static final int ItemTemperaturePreferred_13 = 1033;
    public static final int ItemTemperaturePreferred_14 = 1034;
    public static final int ItemTemperaturePreferred_15 = 1035;
    public static final int ItemTemperaturePreferred_16 = 1036;
    public static final int ItemTemperaturePreferred_17 = 1037;
    public static final int ItemTemperaturePreferred_18 = 1038;
    public static final int ItemTemperaturePreferred_19 = 1039;
    public static final int ItemTemperaturePreferred_20 = 1040;
    public static final int ItemTemperaturePreferred_21 = 1041;
    public static final int ItemTemperaturePreferred_22 = 1042;
    public static final int ItemTemperaturePreferred_23 = 1043;
    public static final int ItemTemperaturePreferred_24 = 1044;
    public static final int ItemTemperaturePreferred_25 = 1045;
    public static final int ItemTemperaturePreferred_26 = 1046;
    public static final int ItemTemperaturePreferred_27 = 1047;
    public static final int ItemTemperaturePreferred_28 = 1048;
    public static final int ItemTemperaturePreferred_29 = 1049;
    public static final int ItemTemperaturePreferred_30 = 1050;
    public static final int ItemTemperaturePreferred_31 = 1051;
    public static final int ItemTemperaturePreferred_32 = 1052;
    public static final int ItemTemperaturePreferred_33 = 1053;
    public static final int ItemTemperaturePreferred_34 = 1054;
    public static final int ItemCategoryCode1_blank = 1079;
    public static final int ItemCategoryCode10_blank = 1088;
    public static final int ItemCategoryCode11_blank = 1089;
    public static final int ItemCategoryCode12_blank = 1090;
    public static final int ItemCategoryCode13_blank = 1091;
    public static final int ItemCategoryCode14_blank = 1092;
    public static final int ItemCategoryCode15_blank = 1093;
    public static final int ItemCategoryCode16_blank = 1094;
    public static final int ItemCategoryCode17_blank = 1095;
    public static final int ItemCategoryCode18_blank = 1096;
    public static final int ItemCategoryCode19_blank = 1097;
    public static final int ItemCategoryCode2_blank = 1080;
    public static final int ItemCategoryCode3_blank = 1081;
    public static final int ItemCategoryCode4_blank = 1082;
    public static final int ItemCategoryCode5_blank = 1083;
    public static final int ItemCategoryCode6_blank = 1084;
    public static final int ItemCategoryCode7_blank = 1085;
    public static final int ItemCategoryCode8_blank = 1086;
    public static final int ItemCategoryCode9_blank = 1087;
    public static final int ItemCode1_blank = 1019;
    public static final int ItemCode2_blank = 1020;
    public static final int ItemCode3_blank = 1021;
    public static final int ItemCode4_blank = 1022;
    public static final int ItemCode5_blank = 1023;
    public static final int ItemCode6_blank = 1024;
    public static final int ItemCode7_blank = 1025;
    public static final int ItemCode8_blank = 1026;
    public static final int ItemFlashMessage_blank = 1117;
    public static final int LayerCodeSource_blank1 = 1101;
    public static final int LayerCodeSource_blank2 = 1155;
    public static final int LeadtimeCumulative_blank = 1131;
    public static final int LeadtimeLevel_blank = 1129;
    public static final int LeadtimeMFG_blank = 1130;
    public static final int LineType_blank1 = 1114;
    public static final int LineType_blank2 = 1161;
    public static final int LocationId_blank = 1198;
    public static final int LotStatusCode_blank1 = 1156;
    public static final int LotStatusCode_blank2 = 1078;
    public static final int LowLevelCode_blank = 1137;
    public static final int MakeBuyCode_blank = 1135;
    public static final int MarginMaInt64enance_blank = 1126;
    public static final int MaterialStatus_blank = 1127;
    public static final int MatrixControlled_blank = 1151;
    public static final int MethodKitConfiguratorPricing_blank = 1076;
    public static final int OrderPolicyCode_blank = 1132;
    public static final int OrganizationId_CoE = 1199;
    public static final int PaymentInstrument_Cheque = 1174;
    public static final int PaymentInstrument_EFT = 1173;
    public static final int PaymentTerms_Greater120 = 1172;
    public static final int PaymentTerms_120 = 1171;
    public static final int PaymentTerms_30 = 1168;
    public static final int PaymentTerms_60 = 1169;
    public static final int PaymentTerms_90 = 1170;
    public static final int PercentMargin_blank = 1125;
    public static final int PlanningCode_blank1 = 1124;
    public static final int PlanningCode_blank2 = 1018;
    public static final int PlanningTimeFenceRule_blank = 1134;
    public static final int PostalCode_blank = 1230;
    public static final int PotencyControl_blank1 = 1157;
    public static final int PotencyControl_blank2 = 1102;
    public static final int PrInt64Message_blank1 = 1119;
    public static final int PrInt64Message_blank2 = 1177;
    public static final int ProcurementType_ContractDetails = 1003;
    public static final int ProductFamily_blank = 1011;
    public static final int ProductGroup_blank = 1014;
    public static final int ProductLine_blank = 1013;
    public static final int ProductType_blank = 1234;
    public static final int RebateCode_blank = 1153;
    public static final int RemitType_Email = 1175;
    public static final int RemitType_Post = 1176;
    public static final int RoundtoWholeNo_blank = 1128;
    public static final int Segment1_blank = 1141;
    public static final int Segment10_blank = 1150;
    public static final int Segment2_blank = 1142;
    public static final int Segment3_blank = 1143;
    public static final int Segment4_blank = 1144;
    public static final int Segment5_blank = 1145;
    public static final int Segment6_blank = 1146;
    public static final int Segment7_blank = 1147;
    public static final int Segment8_blank = 1148;
    public static final int Segment9_blank = 1149;
    public static final int SerialNoRequired_blank = 1075;
    public static final int ServiceLevel_blank = 1154;
    public static final int ShippingCommodityClass_blank = 1056;
    public static final int ShippingConditionsCode_blank1 = 1055;
    public static final int ShippingConditionsCode_blank2 = 1159;
    public static final int StandardGrade_blank = 1107;
    public static final int StandardPotency_blank = 1104;
    public static final int StandardUnitofMeasureConversion_blank = 1118;
    public static final int Status_Active = 1243;
    public static final int Status_blank1 = 1246;
    public static final int Status_blank2 = 1232;
    public static final int Status_blank3 = 1229;
    public static final int Status_ContractApprovalRequested = 1004;
    public static final int Status_ContractDetails = 1010;
    public static final int Status_DeputyHead = 1008;
    public static final int Status_Finance = 1006;
    public static final int Status_HeadofDepartment = 1009;
    public static final int Status_Inactive = 1244;
    public static final int Status_Manager = 1007;
    public static final int Status_Supervisor = 1005;
    public static final int StepNo_StepNo1 = 1255;
    public static final int StepNo_StepNo2 = 1256;
    public static final int StepNo_StepNo3 = 1257;
    public static final int StepNo_StepNo4 = 1258;
    public static final int StepNo_StepNo5 = 1259;
    public static final int StepNo_StepNo6 = 1260;
    public static final int StepNo_StepNo7 = 1261;
    public static final int StepNo_StepNo8 = 1262;
    public static final int StockingType_blank = 1160;
    public static final int StockingType_NonStock = 1112;
    public static final int StockingType_Service = 1113;
    public static final int StockingType_Stocked = 1111;
    public static final int SupplierCategoryCode1_blank = 1178;
    public static final int SupplierCategoryCode10_blank = 1187;
    public static final int SupplierCategoryCode11_blank = 1188;
    public static final int SupplierCategoryCode12_blank = 1189;
    public static final int SupplierCategoryCode13_blank = 1190;
    public static final int SupplierCategoryCode14_blank = 1191;
    public static final int SupplierCategoryCode15_blank = 1192;
    public static final int SupplierCategoryCode16_blank = 1193;
    public static final int SupplierCategoryCode17_blank = 1194;
    public static final int SupplierCategoryCode18_blank = 1195;
    public static final int SupplierCategoryCode19_blank = 1196;
    public static final int SupplierCategoryCode2_blank = 1179;
    public static final int SupplierCategoryCode3_blank = 1180;
    public static final int SupplierCategoryCode4_blank = 1181;
    public static final int SupplierCategoryCode5_blank = 1182;
    public static final int SupplierCategoryCode6_blank = 1183;
    public static final int SupplierCategoryCode7_blank = 1184;
    public static final int SupplierCategoryCode8_blank = 1185;
    public static final int SupplierCategoryCode9_blank = 1186;
    public static final int SupplierCategoryCode9_TakeOnIndicator_YES = 22227;
    public static final int SupplierCategoryCode9_TakeOnIndicator_NO = 22228;
    public static final int SupplierCode_blank = 1167;
    public static final int SupplierHold_blank = 1166;

    // JK.20200723a - Obsolete, maybe reprovisioned. Use new supplier status S1199.
    //public static final int SupplierStatus_Active = 1163;
    //public static final int SupplierStatus_Deactivated = 1165;
    //public static final int SupplierStatus_OnHold = 1164;
    //public static final int SupplierStatus_Pending = 1162;

    public static final int Team_Finance = 1225;
    public static final int Team_Int64ernalControl = 1224;
    public static final int Team_IT = 1226;
    public static final int Team_Operational = 1227;
    public static final int Template_blank = 1140;
    public static final int TemplateAction_blank = 1263;
    public static final int TemplateStatus_TemplateTypeContractServices = 1254;
    public static final int TenantId_blank = 1197;
    public static final int ThruGrade_blank = 1109;
    public static final int ThruPotency_blank = 1106;

    public static final int SA_Currency = 21494;
    public static final int ItemStatusActive = 21495;

    public static final int TypeWarranty_blank = 1073;
    public static final int Unit_Unit1 = 1212;
    public static final int Unit_Unit2 = 1213;
    public static final int Unit_Unit3 = 1214;
    public static final int Unit_Unit4 = 1215;
    public static final int Unit_Unit5 = 1216;
    public static final int Unit_Unit6 = 1217;
    public static final int Unit_Unit7 = 1218;
    public static final int Unit_Unit8 = 1219;
    public static final int UOM_Bottle = 1067;
    public static final int UOM_Dozen = 1061;
    public static final int UOM_Gallon = 1068;
    public static final int UOM_Kilogram = 1057;
    public static final int UOM_Kilolitres = 1064;
    public static final int UOM_Kilometre = 1066;
    public static final int UOM_Litre = 1058;
    public static final int UOM_Metre = 1065;
    public static final int UOM_Milligram = 1063;
    public static final int UOM_Pack = 1059;
    public static final int UOM_Pallet = 1060;
    public static final int UOM_Tonne = 1062;
    public static final int UOMVolumeorWeight_Volume = 1069;
    public static final int UOMVolumeorWeight_Weight = 1070;
    public static final int ValueOrderPolicy_blank = 1133;
    public static final int WarehouseCode1_blank = 1027;
    public static final int WarehouseCode2_blank = 1028;
    public static final int WarehouseCode3_blank = 1029;
    public static final int WarehouseType_blank = 1233;
    public static final String SupplierMasterGetError = "ERS1001";
    public static final String SupplierMasterSaveError = "ERS1001";
    public static final String MessageDetails = "MSD1001";
    public static final int ItemTransactionStatusPending = 21431;
    public static final int ItemTransactionStatusActive = 21432;
    public static final int ItemTransactionStatusInactive = 21433;
    public static final int ItemTransactionStatusExpired = 21434;

    public static final int TransactionType_ItemTransaction = 22362;
    public static final int TransactionType_KPI_Item= 52383;
    public static final int TransactionType_KPI_Supplier = 52387;
    public static final int TransactionType_KPI_Contract = 52391;

    public static final int SMDStatusPending = 52395;
    public static final int SMDStatusApproved = 52377;

    public static final int TransactionType_SupplierCompliant = 52417;

    public static final int SupplierCompliant_NewStatus = 42371;
    public static final int SupplierCompliant_EscalatedStatus = 42372;
    public static final int SupplierCompliant_PendingStatus = 52416;


    public static final int TransactionType_SupplierEnquiry = 52420;

    public static final int SupplierEnquiry_NewStatus = 52423;
    public static final int SupplierEnquiry_EscalatedStatus = 52426;
    public static final int SupplierEnquiry_PendingStatus = 52425;

    public static final int TransactionType_StandardAgreement = 52438;

    public static final int StandardAgreement_NewStatus = 52430;
    public static final int StandardAgreement_PendingStatus = 52428;

    public static final int GoodsReceived_InspectionYes = 52447;
    public static final int GoodsReceived_InspectionNo = 52448;

    public static final int GoodsReturn_New = 52441;

    public static final int ClauseType_Contract = 52528;
    public static final int ClauseType_StandardAgreement = 52529;

    public static final int SupplierComplaintHeaderStatus_Close = 42370;
    public static final int SupplierEnquiryHeaderStatus_Close = 52367;



    //Commodity Configurations
    //LikaFintec
    //public static final int Commodity_Identification = 52530;
    //public static final int Commodity_Specification = 52531;

    //Local
    //public static final int Commodity_Identification = 62529;
    //public static final int Commodity_Specification = 62528;

    //COE Config
    public static final int Commodity_Identification = 62595;
    public static final int Commodity_Specification = 62596;

    //Contract Negotiation
    public static final int ContractNegotiationNewStatus = 63284;
    public static final int ContractNegotiationType = 63283;
}
