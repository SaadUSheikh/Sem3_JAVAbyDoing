import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class WekaDemo {
    public static void main(String[] args) throws Exception {
        // Load dataset
        String datasetPath = "C:\\Users\\Owner\\IdeaProjects\\iris.arff"; // Replace with the path to your ARFF file
        DataSource source = new DataSource(datasetPath);
        Instances dataset = source.getDataSet();

        // Set class index to the last attribute
        dataset.setClassIndex(dataset.numAttributes() - 1);

        // Create and build the classifier
        J48 tree = new J48();
        tree.buildClassifier(dataset);

        // Output the built model
        System.out.println(tree);

        // Make a prediction for the first instance
        double label = tree.classifyInstance(dataset.instance(0));
        System.out.println("Class predicted: " + dataset.classAttribute().value((int) label));
    }
}