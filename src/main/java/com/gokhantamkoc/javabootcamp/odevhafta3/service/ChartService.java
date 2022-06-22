package com.gokhantamkoc.javabootcamp.odevhafta3.service;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import com.gokhantamkoc.javabootcamp.odevhafta3.model.Candle;
import com.gokhantamkoc.javabootcamp.odevhafta3.repository.CSVRepository;
import com.gokhantamkoc.javabootcamp.odevhafta3.util.chart.CandleStickChart;

public class ChartService {
	
	CSVRepository cryptoDataCSVRepository;
	
	public ChartService(CSVRepository cryptoDataCSVRepository) {
		this.cryptoDataCSVRepository = cryptoDataCSVRepository;
	}
	
	public CandleStickChart createChartFromCryptoData() {
		List<Candle> candles = new ArrayList<Candle>(); // Candle ile yeni bir liste oluşturduk.
		CandleStickChart candleStickChart=new CandleStickChart("BTC/USDT Chart"); // CandleStickChart sınıfı türettik
		
		//List<Candle> candless = this.cryptoDataCSVRepository.readCSV(filename:"Binance_BTCUSDT_d.csv");
				//cryptoDataCSVRepository.readCSV(filename:"Binance_BTCUSDT_d.csv");
		
		for(Candle candle :candles ){    
		candleStickChart.addCandle(candle.getTime(),candle.getOpen(),candle.getHigh(),candle.getLow(),candle.getClose(),candle.getVolume());    //added counter to prevent out of memory heap space error 
		}  // Gelen değerleri her seferinde candle sınıfından alıp nesneyi türettik.
		
		// Bu metodu doldurmanizi bekliyoruz..
		

		return candleStickChart;

	}
}
