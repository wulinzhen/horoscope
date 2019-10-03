package com.boc.horoscope.paipan.nayin;

public enum NaYinEnum {
    海中金("甲子乙丑","海中金","金"),
    炉中火("丙寅丁卯","炉中火","火"),
    大林木("戊辰己巳","大林木","木"),
    路傍土("庚午辛未","路傍土","土"),
    剑锋金("壬申癸酉","剑锋金","金"),
    山头火("甲戌乙亥","山头火","火"),
    涧下水("丙子丁丑","涧下水","水"),
    城头土("戊寅己卯","城头土","土"),
    白蜡金("庚辰辛巳","白蜡金","金"),
    杨柳木("壬午癸未","杨柳木","木"),
    泉中水("甲申乙酉","泉中水","水"),
    屋上土("丙戌丁亥","屋上土","土"),
    霹雳火("戊子己丑","霹雳火","火"),
    松柏木("庚寅辛卯","松柏木","木"),
    长流水("壬辰癸巳","长流水","水"),
    砂中金("甲午乙未","砂中金","金"),
    山下火("丙申丁酉","山下火","火"),
    平地木("戊戌己亥","平地木","木"),
    壁上土("庚子辛丑","壁上土","土"),
    金箔金("壬寅癸卯","金箔金","金"),
    佛灯火("甲辰乙巳","佛灯火","火"),
    天河水("丙午丁未","天河水","水"),
    大驿土("戊申己酉","大驿土","土"),
    钗钏金("庚戌辛亥","钗钏金","金"),
    桑柘木("壬子癸丑","桑柘木","木"),
    大溪水("甲寅乙卯","大溪水","水"),
    沙中土("丙辰丁巳","沙中土","土"),
    天上火("戊午己未","天上火","火"),
    石榴木("庚申辛酉","石榴木","木"),
    大海水("壬戌癸亥","大海水","水")
    ;

    private String code;

    private String nanYin;

    private String fiveElement;

    public String getCode() {
        return code;
    }

    public String getNanYin() {
        return nanYin;
    }

    public String getFiveElement() {
        return fiveElement;
    }

    private NaYinEnum(String code, String nanYin, String fiveElement){
        this.code = code;
        this.nanYin = nanYin;
        this.fiveElement = fiveElement;
    }

    public static NaYinEnum getByCodeOrMsg(String codeMsg){
        for (NaYinEnum naYinEnum : NaYinEnum.values()) {
            if (naYinEnum.getCode().startsWith(codeMsg) ||
                    naYinEnum.getCode().endsWith(codeMsg) ||
                    naYinEnum.getNanYin().equalsIgnoreCase(codeMsg)){
                return naYinEnum;
            }
        }
        return null;
    }


}
