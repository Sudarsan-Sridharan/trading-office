package com.trading;

public class TestData {
    static final String FIXML_ALLOCATION_REPORT_MESSAGE = "<FIXML><AllocRpt TransTyp=\"0\" RptID=\"1234567\" GrpID=\"1234567\" AvgPxGrpID=\"AP101\" Stat=\"3\" BizDt=\"2009-06-03\" RptTyp=\"2\" Qty=\"200\" AvgPxInd=\"2\" Side=\"1\" TrdTyp=\"0\" TrdSubTyp=\"5\" AvgPx=\"57.5054673\" TrdDt=\"2009-06-03\" RndPx=\"57.51\" GrpQty=\"350\" RemQty=\"150\" InptDev=\"API\"><Hdr SID=\"ICE\" TID=\"GUF\"/><Instrmt ID=\"2000019\" Src=\"2\"/><Pty R=\"22\" ID=\"IFEU\"/><Pty R=\"21\" ID=\"ICEU\"/><Pty R=\"1\" ID=\"GUF\"/><Pty R=\"12\" ID=\"RYN\"/><Pty R=\"4\" ID=\"GUC\"/><Pty R=\"24\" ID=\"CU120978\"/><Pty R=\"38\" ID=\"S\"><Sub ID=\"1\" Typ=\"26\"/></Pty><Amt Typ=\"CRES\"  Amt=\"10.93\" Ccy=\"EUR\"/><Alloc IndAllocID2=\"2827379\" Qty=\"200\"><Pty R=\"22\" ID=\"IFEU\"/> <Pty R=\"21\" ID=\"ICEU\"/> <Pty R=\"1\" ID=\"TUF\"/> <Pty R=\"4\" ID=\"TCF\"/> <Pty R=\"12\" ID=\"TUF\"/> </Alloc> </AllocRpt></FIXML>";

    static AllocationReport allocationReport() {
        AllocationReport allocationReport = new AllocationReport();

        allocationReport.setAllocationId("1234567");
        allocationReport.setMessageStatus(MessageStatus.NEW);
        allocationReport.setTransactionType(TransactionType.NEW);
        allocationReport.setSecurityId("2000019");
        allocationReport.setSecurityIdSource(SecurityIDSource.SEDOL);

        return allocationReport;
    }
}