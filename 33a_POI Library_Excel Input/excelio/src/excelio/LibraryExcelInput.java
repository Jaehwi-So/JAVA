/*
 # 외부 라이브러리 
 외부 라이브러리 사용법
 1. jar 파일 다운로드
 2. 프로젝트에 lib폴더 추가, jar파일 넣음
 3. Build path -> Configure Build path -> Libraries -> Add Jar을 통해 경로 설정
 */

// # POI 라이브러리 : 엑셀에서 데이터 받기
package excelio;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class LibraryExcelInput {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		//파일 입력 스트림을 사용하여 엑셀파일을 가져옴
		FileInputStream fis = null;
		HSSFWorkbook workbook = null;
		try {
			fis = new FileInputStream("Test.xls");
			try {
				//new HSSFWorkbook()을 통하여 .xls확장자의 엑셀 객체 생성, 
				//엑셀 버전에 따라서 XSSFWorkbook()을 통하여 사용.
				workbook = new HSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				fis.close();	//입력 스트림을 닫음
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		//====엑셀 파일의 모든 데이터 읽기====
		int sheet_idx = 0;
		int row_idx = 0;
		short column_idx = 0;
		//getNumberOfSheets() : 엑셀 객체에서 시트의 개수를 반환
		int sheet_number = workbook.getNumberOfSheets();
		//전체 시트를 순회
		for(sheet_idx = 0; sheet_idx < sheet_number; sheet_idx++) {
			//HSSFSheet : 한 시트
			HSSFSheet sheet = workbook.getSheetAt(sheet_idx);
			if(sheet != null) {	//해당 시트가 비어있지 않다면
				//getPhysicalNumberOfRows() : 해당 시트의 행의 개수를 반환
				int row_number = sheet.getPhysicalNumberOfRows();	
				//해당 시트의 전체 행을 순회
				for(row_idx = 0; row_idx < row_number; row_idx++){
					//HSSFRow : 한 행
					HSSFRow row = sheet.getRow(row_idx);
					if(row != null){	//해당 행이 비어있지 않다면
						//getPhysicalNumberOfCells() : 해당 행의 셀의 개수를 반환
						int cell_number = row.getPhysicalNumberOfCells();
						//해당 시트의 해당 행의 전체 셀을 순회
						for(column_idx = 0; column_idx <= cell_number; column_idx++){
							HSSFCell cell = row.getCell(column_idx);
							String value="";
							if(cell == null){	//해당 셀이 비어있는 경우
								continue;
							}else{	//비어있지 않은 경우 셀의 데이터 타입에 따라서 value값을 받음
								switch (cell.getCellType()){
								case HSSFCell.CELL_TYPE_FORMULA:
									value = cell.getCellFormula();
									break;
								case HSSFCell.CELL_TYPE_NUMERIC:
									value = cell.getNumericCellValue()+"";
									break;
								case HSSFCell.CELL_TYPE_STRING:
									value = cell.getStringCellValue()+"";
									break;
								case HSSFCell.CELL_TYPE_BLANK:
									value = cell.getBooleanCellValue()+"";
									break;
								case HSSFCell.CELL_TYPE_ERROR:
									value = cell.getErrorCellValue()+"";
									break;
								}
							}
							System.out.println(sheet_idx+"번째 시트의 "+row_idx+"번째 행의 "+column_idx+"열의 데이터 : "+value);
						}
					}
				}
			}
		}
	}
}


