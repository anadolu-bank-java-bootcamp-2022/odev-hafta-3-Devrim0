package com.gokhantamkoc.javabootcamp.odevhafta3.repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.assertj.core.internal.bytebuddy.jar.asm.ClassReader;

import com.gokhantamkoc.javabootcamp.odevhafta3.model.Candle;

public class CryptoDataCSVRepository implements CSVRepository {
	
	private final String COMMA_DELIMITER = ",";

	@Override
	public List<Candle> readCSV(String filename) throws FileNotFoundException, IOException {
		List<Candle> candles = new ArrayList<Candle>();
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(filename);
		// Bu alandan itibaren kodunuzu yazabilirsiniz
	
	      BufferedReader br = new BufferedReader(new InputStreamReader(inputStream)); //CSV dosyasını okumak için
	      candles = br.lines().skip(1).map((line) -> { 

	    		  String[] seperate=line.split(COMMA_DELIMITER); //virgüllere göre böl..
	    		  
	    		  long time=Long.valueOf(seperate[0]); //zamam
	    		  double open=Double.valueOf(seperate[3]); 
	    		  double high=Double.valueOf(seperate[4]);
	    		  double low=Double.valueOf(seperate[5]);
	    		  double close=Double.valueOf(seperate[6]);
	    		  double volume=Double.valueOf(seperate[7]);
	    	      Candle item=new Candle(time,open,high,low,close,volume);
                return item; //candle sınıfna gerekli değerlleri atamak için değişken oluşturduk.
	    		  
	      }).collect(Collectors.toList());	      
        br.close(); //dosya kapanması için tanımlandı.
	
		// Bu alandan sonra kalan kod'a dokunmayiniz.
		return candles;
	}

}
