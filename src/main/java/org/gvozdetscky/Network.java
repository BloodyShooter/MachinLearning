package org.gvozdetscky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Network {

    /**
     * Функция активации нейрона, при сумме всех входяших значений нейрона,
     * умноженных на их вес, активируется при значении 0,5, и возврашает 1
     * Иначе возврашает 0
     * @param x - сумма всех входяших значений, умноженых на вес.
     * @return возврашает 1(нейрон активирован), или ноль(нейрон не активирован),
     * Значение активации 0,5
     */
    private int activationFunction(double x) {
        if (x >= 0.5)
            return 1;
        else
            return 0;
    }

    /**
     * Функция должна предсказывать, пойдет человек на вечеринку, или нет
     * Принимает значение наличие алкоголя, дождя и друзей на вечеринке
     * @param vodka наличие алкоголя
     * @param rain наличие на улицы дождя
     * @param friend наличие друзей на вечеринке
     * @return возврашает boolean значение, true, если предпологается, что подйдет
     * false, что останеться дома
     */
    public boolean predict(int vodka, int rain, int friend) {
        List<Integer> inputs = Arrays.asList(vodka, rain, friend);
        List<Double> weightsInputToHidden1 = Arrays.asList(0.25, 0.25, 0.);

        List<Double> weightsInputToHidden2 = Arrays.asList(0.5, -0.4, 0.9);

        List<List<Double>> weightsInputToHidden = Arrays.asList(
                weightsInputToHidden1,
                weightsInputToHidden2
        );

        List<Double> weightsHiddenToOutput = Arrays.asList(-1., 1.);

        List<Double> hiddenInput = new ArrayList<>();
        hiddenInput.add(dot(inputs, weightsInputToHidden1));
        hiddenInput.add(dot(inputs, weightsInputToHidden2));

        System.out.println("hiddenInput: " + hiddenInput);

        List<Integer> hiddenOutput = Arrays.asList(
                activationFunction(hiddenInput.get(0)),
                activationFunction(hiddenInput.get(1))
        );

        System.out.println("hidden output: " + hiddenOutput);

        Double output = dot(hiddenOutput, weightsHiddenToOutput);

        System.out.println("Output: " + output);

        return activationFunction(output) == 1;
    }

    /**
     * Функция принимает значения входяших нейронов, и их веса.
     * Перемножает их, и считает сумму значений
     * @param inputs входяшие нейроны
     * @param weightsInputToHidden1 входяшие веся для нейронов
     * @return возврашает сумму произведений веса и нейрона
     */
    private Double dot(List<Integer> inputs, List<Double> weightsInputToHidden1) {

        List<Double> hiddenInput = new ArrayList<>();

        for (int i = 0; i < inputs.size(); i++) {
            hiddenInput.add(inputs.get(i) * weightsInputToHidden1.get(i));
        }

        return hiddenInput.stream().mapToDouble(d -> d).sum();
    }
}
