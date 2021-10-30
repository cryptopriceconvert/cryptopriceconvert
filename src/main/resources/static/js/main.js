/**
 * author pradeep bhati
 */
$(function () {
    fx.rates = { // update on 6 june 2021
        "USD": 1,
        "AED": 3.6725,
        "AFN": 78.5781,
        "ALL": 100.9479,
        "AMD": 520.0715,
        "ANG": 1.79,
        "AOA": 647.0295,
        "ARS": 94.8514,
        "AUD": 1.2969,
        "AWG": 1.79,
        "AZN": 1.6992,
        "BAM": 1.607,
        "BBD": 2,
        "BDT": 84.7752,
        "BGN": 1.6081,
        "BHD": 0.376,
        "BIF": 1964.7106,
        "BMD": 1,
        "BND": 1.3238,
        "BOB": 6.8733,
        "BRL": 5.0829,
        "BSD": 1,
        "BTN": 72.9757,
        "BWP": 10.5841,
        "BYN": 2.5372,
        "BZD": 2,
        "CAD": 1.2079,
        "CDF": 1989.192,
        "CHF": 0.9005,
        "CLP": 719.2795,
        "CNY": 6.4005,
        "COP": 3614.8438,
        "CRC": 616.0626,
        "CUC": 1,
        "CUP": 25.75,
        "CVE": 90.5969,
        "CZK": 20.9409,
        "DJF": 177.721,
        "DKK": 6.1297,
        "DOP": 56.7285,
        "DZD": 133.8568,
        "EGP": 15.6746,
        "ERN": 15,
        "ETB": 43.5728,
        "EUR": 0.8217,
        "FJD": 2.0384,
        "FKP": 0.7064,
        "FOK": 6.1297,
        "GBP": 0.7064,
        "GEL": 3.1251,
        "GGP": 0.7064,
        "GHS": 5.7905,
        "GIP": 0.7064,
        "GMD": 51.6236,
        "GNF": 9812.6361,
        "GTQ": 7.7186,
        "GYD": 209.0657,
        "HKD": 7.7561,
        "HNL": 24.0234,
        "HRK": 6.1906,
        "HTG": 90.7084,
        "HUF": 285.2758,
        "IDR": 14308.3362,
        "ILS": 3.2576,
        "IMP": 0.7064,
        "INR": 72.9759,
        "IQD": 1459.3753,
        "IRR": 41846.8233,
        "ISK": 121.2843,
        "JMD": 149.1963,
        "JOD": 0.709,
        "JPY": 109.7669,
        "KES": 107.7535,
        "KGS": 84.6802,
        "KHR": 4075.85,
        "KID": 1.2969,
        "KMF": 404.2149,
        "KRW": 1114.4651,
        "KWD": 0.2996,
        "KYD": 0.8333,
        "KZT": 428.142,
        "LAK": 9450.2185,
        "LBP": 1507.5,
        "LKR": 197.9658,
        "LRD": 171.553,
        "LSL": 13.5044,
        "LYD": 4.4473,
        "MAD": 8.8285,
        "MDL": 17.6491,
        "MGA": 3765.8986,
        "MKD": 50.895,
        "MMK": 1647.4578,
        "MNT": 2850.5555,
        "MOP": 7.9887,
        "MRU": 36.1671,
        "MUR": 40.4565,
        "MVR": 15.4247,
        "MWK": 796.594,
        "MXN": 20.0512,
        "MYR": 4.126,
        "MZN": 61.4691,
        "NAD": 13.5044,
        "NGN": 429.9551,
        "NIO": 34.9504,
        "NOK": 8.3385,
        "NPR": 116.7611,
        "NZD": 1.3916,
        "OMR": 0.3845,
        "PAB": 1,
        "PEN": 3.8449,
        "PGK": 3.5151,
        "PHP": 47.7735,
        "PKR": 154.7882,
        "PLN": 3.6708,
        "PYG": 6626.1777,
        "QAR": 3.64,
        "RON": 4.0486,
        "RSD": 96.5075,
        "RUB": 73.0691,
        "RWF": 1000.8321,
        "SAR": 3.75,
        "SBD": 7.93,
        "SCR": 16.4859,
        "SDG": 425.5946,
        "SEK": 8.2997,
        "SGD": 1.3238,
        "SHP": 0.7064,
        "SLL": 10223.7801,
        "SOS": 578.5826,
        "SRD": 14.1536,
        "SSP": 177.5792,
        "STN": 20.1299,
        "SYP": 1301.3845,
        "SZL": 13.5044,
        "THB": 31.2218,
        "TJS": 11.3076,
        "TMT": 3.4999,
        "TND": 2.7172,
        "TOP": 2.2126,
        "TRY": 8.6773,
        "TTD": 6.7533,
        "TVD": 1.2969,
        "TWD": 27.649,
        "TZS": 2315.695,
        "UAH": 27.2448,
        "UGX": 3536.1917,
        "UYU": 43.566,
        "UZS": 10610.0224,
        "VES": 3113316.3078,
        "VND": 22983.8014,
        "VUV": 107.8527,
        "WST": 2.5067,
        "XAF": 538.9533,
        "XCD": 2.7,
        "XDR": 0.6953,
        "XOF": 538.9533,
        "XPF": 98.0466,
        "YER": 249.8146,
        "ZAR": 13.5052,
        "ZMW": 22.5283
    };
    
    fx.base = "USD";

    $('#inputNumber').keyup(function () {
        convertCurrency();        
    });

    $('#toCurr').change(function(){
        convertCurrency();  
    });
    $('#fromCurr').change(function(){
        convertCurrency();  
    });

    function convertCurrency() {
        var enterValue = $('#inputNumber').val();
        var fromCurrency = $('#fromCurr').val();
        var toCurrency = $('#toCurr').val();
        let output = fx.convert(enterValue, {from: fromCurrency, to: toCurrency});

        $('#resultValue').text(output.toFixed(4));
    }
    
    // crypto conversion logic
    
    $('#fromCypto').change(function(){
        convertCrypto();  
    });
    $('#toCurrency').change(function(){
        convertCrypto();  
    });
    
    function convertCrypto() {
        var fromcrypto = $('#fromCypto').val();
        var toCurr = $('#toCurrency').val();
        var amount= 0;
        var output=0;
        // ajax request
        var joisds = fromcrypto+"-"+toCurr;
        var urlValue = "/api/crypto-convert/"+joisds;
		    $.ajax({
		    type: "GET",
		    contentType: "application/json",
		    url: urlValue,
		    cache: false,
		    timeout: 600000,
		    success: function (data) {
		        amount = data;     
		        output = fx.convert(amount, {from: "INR", to: toCurr}); 
		        $('#resultValue').text(output.toFixed(4));
		    },
		    error: function (e) {
		
		    }
		});

        
    }
});

