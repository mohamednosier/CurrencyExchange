package com.example.tomm.currencyexchange;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tomm on 4/4/16 AD.
 */
public interface CurrencyExchangeService {
    @GET("latest?access_key=55ea1282d36a5ea0d9b30dc3a236b315")
    Call<CurrencyExchange> loadCurrencyExchange();
}
