package Java8.StreamAPI.CollectorsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Trade {
    private String tradeId;
    private String trader;
    private double notional;
    private String currency;
    private String region;

    public Trade(String tradeId, String trader, double notional, String currency, String region) {
        this.tradeId = tradeId;
        this.trader = trader;
        this.notional = notional;
        this.currency = currency;
        this.region = region;
    }

    public String getTradeId() {
        return tradeId;
    }

    public String getTrader() {
        return trader;
    }

    public double getNotional() {
        return notional;
    }

    public String getCurrency() {
        return currency;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "tradeId='" + tradeId + '\'' +
                ", trader='" + trader + '\'' +
                ", notional=" + notional +
                ", currency='" + currency + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Trade> list=new ArrayList<>();
        list.add(new Trade("T1001","John",540000,"USD","NA"));
        list.add(new Trade("T1002","Mark",10000,"SGD","APAC"));
        list.add(new Trade("T1003","David",120000,"USD","NA"));
        list.add(new Trade("T1004","Peter",4000,"USD","NA"));
        list.add(new Trade("T1005","Mark",300000,"SGD","APAC"));
        list.add(new Trade("T1006","Mark",25000,"CAD","NA"));
        list.add(new Trade("T1007","Lizza",285000,"EUR","EMEA"));
        list.add(new Trade("T1008","Maria",89000,"JPY","EMEA"));
        list.add(new Trade("T1009","Sanit",1000000,"INR","APAC"));
        System.out.println(list);

        //group the trade deals according to country region
        Map<String,List<String>> map=list.stream().collect(Collectors.groupingBy(Trade::getRegion,Collectors.mapping(Trade::getTradeId,Collectors.toList())));
        System.out.println(map);

        //counting number of deals in each region.
        Map<String,Long>res=list.stream().collect(Collectors.groupingBy(Trade::getRegion,Collectors.counting()));
        System.out.println(res);


        //group based on currency
        Map <String,Long>res2=list.stream().collect(Collectors.groupingBy(Trade::getCurrency,Collectors.counting()));
        System.out.println(res2);




    }
}
