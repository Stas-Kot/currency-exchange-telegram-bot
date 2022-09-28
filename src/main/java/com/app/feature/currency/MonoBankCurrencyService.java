package com.app.feature.currency;

import com.app.feature.currency.dto.Currency;
import com.app.feature.currency.dto.CurrencyItemMono;
import com.app.feature.currency.dto.CurrencyItemPrivat;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

//public class MonoBankCurrencyService{
//    public List<CurrencyItemMono> getRate(List<Currency> currencyList) {
//        String url = "https://api.monobank.ua/bank/currency";
//
//        String json;
//        try {
//            json = Jsoup
//                    .connect(url)
//                    .ignoreContentType(true)
//                    .get()
//                    .body()
//                    .text();
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw new IllegalStateException("Can't connect to Privat API");
//        }
//        Type typeToken = TypeToken
//                .getParameterized(List.class, CurrencyItemPrivat.class)
//                .getType();
//        List<CurrencyItemMono> currencyItemsMono = new Gson().fromJson(json, typeToken);
//        System.out.println("currencyItems = " + currencyItemsMono);
//        List<CurrencyItemMono> CurrencyItemMonoList = new ArrayList<>();
//        for(Currency currency: currencyList) {
//            String currencyName = currency.name().equals("RUB") ? "RUR" : currency.name();
//            currencyItemList.add(currencyItems.stream()
//                    .filter(it -> it.getCcy().name().equals(currencyName))
//                    .findFirst()
//                    .orElseThrow());
//        }
//        return CurrencyItemMonoList;
//    }
//}
