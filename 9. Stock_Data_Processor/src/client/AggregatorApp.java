package client;

import java.io.FileNotFoundException;
import java.io.IOException;

import aggregators.AggregatorProcessor;
import aggregators.MaxAggregator;

public class AggregatorApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		MaxAggregator agg = new MaxAggregator();
		AggregatorProcessor<MaxAggregator> aggsProcessor = new AggregatorProcessor<MaxAggregator>(agg, "table.csv");
		double value = aggsProcessor.runAggregator(1);
		System.out.println(value);
		
	}

}
