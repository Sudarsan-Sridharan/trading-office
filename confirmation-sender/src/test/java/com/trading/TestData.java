package com.trading;

public class TestData {

    static AllocationReport allocationReport(String allocationId) {
        AllocationReport allocationReport = new AllocationReport();

        allocationReport.setAllocationId(allocationId);
        allocationReport.setTransactionType(TransactionType.NEW);
        allocationReport.setSecurityId("2000019");
        allocationReport.setSecurityIdSource(SecurityIDSource.SEDOL);

        allocationReport.setInstrument(instrument());

        return allocationReport;
    }

    private static Instrument instrument() {
        Instrument instrument = new Instrument();

        instrument.setCurrency("USD");
        instrument.setExchange("NASDAQ");
        instrument.setName("AMAZON STOCKS");
        instrument.setSymbol("AMZN");

        return instrument;
    }
}