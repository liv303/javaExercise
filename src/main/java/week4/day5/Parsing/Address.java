package week4.day5.Parsing;

public class Address {
    private String fullAddr;
    private String sido;   // 행정구역 '시, 도'
    private String sigungu;

    public Address(String fullAddr, String side, String sigungu) {
        this.fullAddr = fullAddr;
        this.sido = sido;
        this.sigungu = sigungu;
    }

    public String getFullAddr() {
        return fullAddr;
    }

    public String getSido() {
        return sido;
    }

    public String getSigungu() {
        return sigungu;
    }
}
