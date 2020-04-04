package excelio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

@SuppressWarnings("deprecation")
public class LibraryExcelOut {
	public static void main(String[] args) {
		
		//가상 Database, 필드들의 집합
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		//DB에서 Key값과 해당하는 값을 쌍으로 저장하는 필드에 해당하는 map
		Map<String, Object> map = null;	//Map<Key, 내용>
		ArrayList<String> column = new ArrayList<String>();	//DB의 Key값(속성)의 집합
		//데이터베이스의 한 행에 이름, 키, 몸무게에 해당하는 셀 추가
		int num = 0;
		String name[] = {"kim", "lee", "park", "jung", "son"};
		map = new HashMap<String, Object>();
		map.put("name", "이름");
		map.put("height", "키");
		map.put("weight", "몸무게");
		list.add(map);
		for(int i = 0; i < 5; i++){	//행 10개에 데이터 삽입
		    map = new HashMap<String, Object>();
		    map.put("name", name[i]);	//순서
		    num = new Random().nextInt(70) + 130;
		    map.put("height", num); //해당 행의 1열에 데이터 삽입
		    num = new Random().nextInt(70) + 40;
		    map.put("weight", num); //해당 행의 2열에 데이터 삽입
		    list.add(map);
		}
		
		//key값(name, height, weight)들을 넣음. 한 행에 몇개의 열이 들어갔는지를 파악
		if(list !=null && list.size() >0){
		    Map<String,Object> m = list.get(0);
		    for(String k : m.keySet()){
		    	column.add(k);
		    }
		}
		
		//new HSSFWorkbook()을 통하여 .Workbook(xls확장자의 엑셀 객체) 생성
		HSSFWorkbook workbook = new HSSFWorkbook();
		//HSSFSheet : 한 시트
		HSSFSheet sheet = workbook.createSheet("mySheet");
		//HSSFRow : 한 행
		HSSFRow row = null;
		//HSSFCell : 한 셀
		HSSFCell cell = null;
		//임의의 DB데이터 조회 
		if(list != null && list.size() > 0){
		    int i = 0;
		    //list의 모든 요소 순회 (한 행에 해당하는 데이터들을 차례로 순회)
		    for(Map<String,Object> list_row_data : list){
		        //sheet.createRow(i) : 시트에 하나의 행을 생성한다(i값이 0이면 1번째 행) 
		        row = sheet.createRow((short)i);
		        //열들의 key값들을 순회하며 해당 행의 모든 열의 데이터를 입력한다.
		        if(column != null && column.size() > 0){
		            for(short j = 0 ; j < column.size() ; j++){
		                //createCell(j) : 생성된 행에 j번째 셀을 생성한다.
		                cell=row.createCell(j);
		                //데이터베이스 Map에 담긴 해당 index의 key값의 데이터를 셀에 추가한다.
		                cell.setCellValue(String.valueOf(list_row_data.get(column.get(j))));
		            }
		        }
		        i++;
		    }
		}
		
		//파일 출력 스트림을 이용하여 엑셀 확장자 형태로 출력
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("TestOutput.xls");
			workbook.write(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("파일 생성 완료");
	}
}
