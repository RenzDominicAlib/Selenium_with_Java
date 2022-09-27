import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven {

	public static void main(String[] args) throws IOException {

	}

	public ArrayList<String> getData(String sheetName, String RowSelection) throws IOException {

		ArrayList datas = new ArrayList();

		// Access the xlsx file using FileInputStream & XSSFWorkbook class

		FileInputStream filePath = new FileInputStream(
				"C:\\Users\\renz dominic alib\\eclipse-workspace\\excel_datadriven_source.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(filePath);

		// Checking the number of sheets in the xlsx file and Access the proper sheet

		int sheetsQty = workBook.getNumberOfSheets();

		for (int i = 0; i < sheetsQty; i++) {

			if (workBook.getSheetName(i).equalsIgnoreCase(sheetName)) {
				XSSFSheet sheetNeeded = workBook.getSheetAt(i);
				// From here, Create a logic based on data cell structures

				// Access the "Row" where "RowSelection" is located
				java.util.Iterator<Row> rows = sheetNeeded.rowIterator(); // Sheet is a collection of rows
				Row headerRow = rows.next();

				java.util.Iterator<Cell> HeaderCells = headerRow.cellIterator(); // Row is a collection of cells

				int k = 0;
				int coloumnIndex = 0;
				while (HeaderCells.hasNext()) {
					Cell HeaderCellValue = HeaderCells.next();
					if (HeaderCellValue.getStringCellValue().equalsIgnoreCase("RowSelection")) {
						// desired coloumn where "RowSelection" is located
						coloumnIndex = k;
					}
					k++;
				}
				System.out.println("From the row header, 'RowSelection' has a column index of " + coloumnIndex);

				while (rows.hasNext()) {
					Row currentRow = rows.next();
					if (currentRow.getCell(coloumnIndex).getStringCellValue().equalsIgnoreCase(RowSelection)) {
						// desired row where testCaseName is located
						java.util.Iterator<Cell> currRowCells = currentRow.iterator();
						while (currRowCells.hasNext()) {
							Cell currCell = currRowCells.next();
//							if(cell.getCellType() == CellType.STRING) {
//								String currRowData = currRowCells.next().getStringCellValue();
//								datas.add(currRowData);
//							}

							switch (currCell.getCellType()) {
							case STRING:
								datas.add(currCell.getStringCellValue());
								break;
							case NUMERIC:
								datas.add(currCell.getNumericCellValue());
								break;
							default:
								System.out.println("This cell is not a STRING or NUMERIC");
								break;
							}

						}
					}
				}

			}

		}

		return datas;
	}

}
