package org.onepf.sample.trivialdrivetest;

import org.onepf.oms.OpenIabHelper;
import org.onepf.oms.SkuManager;

import java.util.HashMap;
import java.util.Map;

/**
 * In-app products configuration.
 * <p/>
 * Created by krozov on 01.09.14.
 */
public final class InAppConfig {
    //premium upgrade (non-consumable)
    public static final String SKU_PREMIUM = "sku_premium";
    //gas (consumable)
    public static final String SKU_GAS = "sku_gas";
    //subscription (infinite gas)
    public static final String SKU_INFINITE_GAS = "sku_infinite_gas";

    //Google Play
    public static final String CafeBazaarKey
    ="MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwCqdaJkyjb77CpTa9qRIuP/t0wPKYw3fur6+" +
            "X9l9xPYDqpMk/ZMyDsYitR7mykf6YEBHEh29YHIHt7qk2ai2tc/cl0wl8RAA/8IBQeu2Ma9Syx7Z5vMSmnzC4r52Jqk2+" +
            "nsFGjaHqpL3zrNAJ5zJ3hDubmQOIGHFWA37B/G9uBucpEmDEqebUa8qFWltn74C63PKWhOJtGVO0AM47hWAHgDLn02femonqtX7sIpJHkCAwEAAQ==";
    public static Map<String, String> STORE_KEYS_MAP;

    public static void init() {
        STORE_KEYS_MAP = new HashMap<>();
        STORE_KEYS_MAP.put(OpenIabHelper.NAME_CAFEBAZAAR, InAppConfig.CafeBazaarKey);

        SkuManager.getInstance()
                .mapSku(SKU_GAS, OpenIabHelper.NAME_CAFEBAZAAR, "test2")
                .mapSku(SKU_PREMIUM, OpenIabHelper.NAME_CAFEBAZAAR, "sku_premium")
                .mapSku(SKU_INFINITE_GAS, OpenIabHelper.NAME_CAFEBAZAAR, "sku_infinite_gas");
    }

    private InAppConfig() {
    }
}
