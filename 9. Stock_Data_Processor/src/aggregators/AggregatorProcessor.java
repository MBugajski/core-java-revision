package aggregators;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AggregatorProcessor<T extends Aggregator> {

	private String path;
	private Aggregator agg;

	public AggregatorProcessor(Aggregator aggregator, String file) {
		super();
		this.path = file;
		this.agg = aggregator;
	}

	public double runAggregator(int i) throws FileNotFoundException, IOException {
		List<Double> csvColumn = csvGetColumn(csvReader(path), i);
		for (Double value : csvColumn) {
			agg.add(value);
		}
		return agg.calculate();
	}

	private static List<List<Double>> csvReader(String path) throws FileNotFoundException, IOException {
		List<List<Double>> contents = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			br.readLine();
			String line;
			while ((line = br.readLine()) != null) {
				Double[] values = Arrays.stream(line.split(",")).map(Double::parseDouble).toArray(Double[]::new);
				contents.add(Arrays.asList(values));
			}
		}
		return contents;
	}

	private static List<Double> csvGetColumn(List<List<Double>> csvContents, int i) {
		List<Double> column = new ArrayList<>();
		for (List<Double> row : csvContents) {
			column.add(row.get(i - 1));
		}
		return column;
	}
}
