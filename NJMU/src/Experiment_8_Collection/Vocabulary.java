package Experiment_8_Collection;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Gremmie102
 * @date 2022/6/21 10:03
 * @purpose : 编写一个程序读取两个不用的文件并比较它们所使用的词汇。要统计出每个文件中出现的不同单词的集合，并计算两个的交集部分
 */
public class Vocabulary {
    public static Set vocabulary(String string1,String string2) throws FileNotFoundException {
        File file1 = new File(string1);
        File file2 = new File(string2);
        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();
        while (scanner1.hasNext()) {
            set1.add(scanner1.next());
        }
        while (scanner2.hasNext()) {
            set2.add(scanner2.next());
        }

        Set<String> longSet;
        Set<String> shortSet;
        if (set1.size() > set2.size()) {
            longSet = set1;
            shortSet = set2;
        } else {
            longSet = set2;
            shortSet = set1;
        }
        Iterator<String> longIterator = longSet.iterator();
//        Iterator<String> shortIterator = shortSet.iterator();
        while (longIterator.hasNext()) {
            String str = longIterator.next();
            if (shortSet.contains(str)) {
                set3.add(str);
            }
        }
        return set3;
    }

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println(vocabulary("E:\\JAVAcode\\gyljava\\NJMU\\src\\Experiment_8_Collection\\Vocabulary1",
                            "E:\\JAVAcode\\gyljava\\NJMU\\src\\Experiment_8_Collection\\Vocabulary2"));
    }
}
