package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import model.BookPojo;

public class BookDaoFileCollectionImpl implements BookDao {
	
	// this is a collection which will holds the data read from the file at the begining of the appln
	// likewise the data in this collection should be writern to a file before the program shuts down
	List<BookPojo> bookFileDataStore = new ArrayList<BookPojo>();  
	
	
	public BookDaoFileCollectionImpl() {
		// reading the contents of the file and adding the data to the collection bookFileDataStore
		try {
			// 1.
			File myFile = new File("FileDB.txt");
			// 2.
			FileReader fr = new FileReader("FileDB.txt");
			// 3. 
			BufferedReader br = new BufferedReader(fr);
			// 4.
			String line = null;
			while((line=br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer("=:");
				
				st.nextToken();
				String bId = st.nextToken();
				int bookId = Integer.parseInt(bId);
				
				st.nextToken();
				String bookTitle = st.nextToken();
				
				st.nextToken();
				String bookAuthor = st.nextToken();
				
				st.nextToken();
				String bookGenre = st.nextToken();
				
				st.nextToken();
				String bPublished = st.nextToken();
				LocalDate bookPublished = LocalDate.parse(bPublished);
				
				st.nextToken();
				String bCost = st.nextToken();
				int bookCost = Integer.parseInt(bCost);
				
				BookPojo bookPojo = new BookPojo(bookId, bookTitle, bookAuthor, bookGenre, bookPublished, bookCost, "");
				bookFileDataStore.add(bookPojo);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		int newBookId = 0;
		if(bookFileDataStore.size()==0) {
			newBookId = 101; // my own logic to compute the new book id
		}else {
			newBookId = bookFileDataStore.get(bookFileDataStore.size()-1).getBookId() + 1; // my own logic to compute the new book id
		}
		newBook.setBookId(newBookId);
		bookFileDataStore.add(newBook.copyBookData());
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		for(int i=0;i<bookFileDataStore.size();i++) {
			if(bookFileDataStore.get(i).getBookId() == updateBook.getBookId()) {
				bookFileDataStore.set(i, updateBook.copyBookData());
			}
		}
		return updateBook;
	}

	@Override
	public void removeBook(int bookId) {
		//i am able to use this for loop because List is indexed
		for(int i=0;i<bookFileDataStore.size();i++) {
			if(bookFileDataStore.get(i).getBookId() == bookId) {
				bookFileDataStore.remove(i);
			}
		}
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		List<BookPojo> returnBookDataStore = new ArrayList<BookPojo>(bookFileDataStore);
		return returnBookDataStore;
	}

	@Override
	public BookPojo fetchById(int bookId) {
		BookPojo returnBookPojo = null;
		for(int i=0;i<bookFileDataStore.size();i++) {
			if(bookFileDataStore.get(i).getBookId() == bookId) {
				returnBookPojo = bookFileDataStore.get(i).copyBookData();
			}
		}
		return returnBookPojo;
	}

	@Override
	public List<BookPojo> fetchByGenre(String bookGenre) {
		List<BookPojo> returnBookPojoByGenre = new ArrayList<BookPojo>();
		for(int i=0;i<bookFileDataStore.size();i++) {
			if(bookFileDataStore.get(i).getBookGenre().equals(bookGenre)) {
				returnBookPojoByGenre.add(bookFileDataStore.get(i).copyBookData());
			}
		}
		return returnBookPojoByGenre;
	}

	@Override
	public boolean writeToFile() {
		
		// to work with files, lets create a File object representing the file
		
		try {
			// 1.
			//File myFile = new File("FileDB.txt"); // if the file FileDB.txt does not exist, it will be created automatically
			// 2.
			FileWriter fw = new FileWriter("FileDB.txt");
			// 3.
			// traverse through the collection bookFileDataStore
			// as we traverse write the string represtation of BookPojo objects to the file
			for(BookPojo eachBook: bookFileDataStore) {
				System.out.println(eachBook.toString());
				fw.write(90);
				//fw.write(eachBook.toString().toCharArray());
			}	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
	}

}
