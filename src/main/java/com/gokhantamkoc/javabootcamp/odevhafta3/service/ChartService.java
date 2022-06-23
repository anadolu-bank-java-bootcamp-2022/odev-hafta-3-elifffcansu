package com.gokhantamkoc.javabootcamp.odevhafta3.service;

import java.io.FileNotFoundException;
import java.io.IOException;
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
		// Bu metodu doldurmanizi bekliyoruz.
		CandleStickChart candleStickChart =new CandleStickChart("BTC/USTD Chart");

		try {
			List<Candle> candles= this.cryptoDataCSVRepository.readCSV("Binance_BTCUSDT_d.csv");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return candleStickChart;
	}
}
