package study.stanfordcorenlp;

import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

/**
 * Created by Administrator on 2017/7/21 0021.
 */
public class NlpUtil {

    public static void main(String[] args) {
        String props = "StanfordCoreNLP-chinese.properties";
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        Annotation annotation;
        //if  data from file
        //annotation = new Annotation(IOUtils.slurpFileNoExceptions(file));
        annotation = new Annotation("这家酒店很好，我很喜欢。");


        pipeline.annotate(annotation);
        pipeline.prettyPrint(annotation, System.out);
    }

}
