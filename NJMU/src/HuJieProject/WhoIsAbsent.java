package HuJieProject;
/**
 * @author Gremmie102
 * @date 2022/5/12 18:30
 * @purpose : 通过导入表格判断缺席的人数
 */
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jxl.*;
import jxl.read.biff.BiffException;

public class WhoIsAbsent {

    public static void main(String[] args)
    {
        try {
            List<String> classList=new ArrayList<>();//班级名单
            List<String> conferees=new ArrayList<>();//参会人员
            List<String> set=new ArrayList<>();
            List<String> absent=new ArrayList<>();//缺席人员

            //注意！！jxl只支持.xls的文件，记得改一下后缀，
            // 否则就会出现“Unable to recognize OLE stream”的报错
//            Scanner scanner = new Scanner();
//            String str = scanner.nextLine();
            File f1 =new File("C:\\Users\\lenovo\\Desktop\\班级名册.xls");
            Workbook workbook1=Workbook.getWorkbook(f1);
            Sheet sheet1 =workbook1.getSheet(0);
            for(int i=1;i<sheet1.getRows();i++) {
                Cell cell1 =sheet1.getCell(0, i);
                Cell cell2 =sheet1.getCell(1, i);
                String name1=cell1.getContents()+cell2.getContents();
                classList.add(name1);
            }//制作班级名单


            File f2=new File("C:\\Users\\lenovo\\Desktop\\参会人员.xls");
            Workbook workbook2=Workbook.getWorkbook(f2);
            Sheet sheet2 =workbook2.getSheet(0);
            for(int i=9;i<sheet2.getRows();i++) {
                Cell cell3=sheet2.getCell(0, i);//每一行的第一个单元格
                String name2=cell3.getContents();
                set.add(name2);
            }

            for(String s1:set) {
                Pattern pattern1 = Pattern.compile("(?<=\\()[^\\)]+");//运用正则表达式来规定格式
                Matcher matcher1 = pattern1.matcher(s1);
                while(matcher1.find()){
                    String s2=matcher1.group();
                    int k=0;
                    for(int i=0;i<s2.length();i++)
                        if(Character.isDigit(s2.charAt(i))) {
                            k=i;
                            break;
                        }
                    conferees.add(s2.substring(k));
                }//制作参会人员名单
            }
//            for (String str:conferees) {
//                System.out.println(str);
//            }
            System.out.println("用户昵称（入会昵称）  首次入会时间             累计参会时长");
            for(int i=9;i<sheet2.getRows()-2;i++) {
                Cell cell4=sheet2.getCell(1, i);
                Cell cell5=sheet2.getCell(4, i);
                System.out.printf("%-15s%-22s%-10s",conferees.get(i-9),cell4.getContents(),cell5.getContents());
                System.out.println();
            }
            System.out.println();

            System.out.println("缺席人员名单：");
            absent.addAll(classList);
            absent.removeAll(conferees);
            for(String s3:absent) {
                System.out.println(s3);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }


}
