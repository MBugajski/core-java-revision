package aggregators;

import java.util.List;

public class MinAggregator extends Aggregator{

	public MinAggregator(List<Double> values) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		double min = numbers.get(0);
		for(double number : numbers){
			if(number < min){
				min = number;
			}
		}
		return min;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}

}
