package org.gvozdetscky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Network {

    private int activationFunction(double x) {
        if (x >= 0.5)
            return 1;
        else
            return 0;
    }

    public boolean predict(int vodka, int rain, int friend) {
        List<Integer> inputs = Arrays.asList(vodka, rain, friend);
        List<Double> weightsInputToHidden1 = new ArrayList<Double>();
        weightsInputToHidden1.add(0.25);
        weightsInputToHidden1.add(0.25);
        weightsInputToHidden1.add(0.);

        List<Double> weightsInputToHidden2 = new ArrayList<Double>();
        weightsInputToHidden2.add(0.5);
        weightsInputToHidden2.add(-0.4);
        weightsInputToHidden2.add(0.9);

        List<List<Double>> weightsInputToHidden = new ArrayList<List<Double>>();
        weightsInputToHidden.add(weightsInputToHidden1);
        weightsInputToHidden.add(weightsInputToHidden2);

        List<Double> weightsHiddenToOutput = new ArrayList<Double>();
        weightsHiddenToOutput.add(-1.);
        weightsHiddenToOutput.add(1.);

        List<Double> hiddenInput = new ArrayList<>();
        hiddenInput.add(dot(getHiddenInput(inputs, weightsInputToHidden1)));
        hiddenInput.add(dot(getHiddenInput(inputs, weightsInputToHidden2)));

        System.out.println("hiddenInput: " + hiddenInput);

        List<Integer> hiddenOutput = new ArrayList<>();
        hiddenOutput.add(activationFunction(hiddenInput.get(0)));
        hiddenOutput.add(activationFunction(hiddenInput.get(1)));

        System.out.println("hidden output: " + hiddenOutput);

        Double output = dot(getHiddenInput(hiddenOutput, weightsHiddenToOutput));

        System.out.println("Output: " + output);

        return activationFunction(output) == 1;
    }

    private List<Double> getHiddenInput(List<Integer> inputs, List<Double> weightsInputToHidden1) {

        List<Double> hiddenInput = new ArrayList<Double>();

        for (int i = 0; i < inputs.size(); i++) {
            hiddenInput.add(inputs.get(i) * weightsInputToHidden1.get(i));
        }

        return hiddenInput;
    }

    private Double dot(List<Double> hiddeninput) {
        return hiddeninput.stream().mapToDouble(d -> d).sum();
    }
}
