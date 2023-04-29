#include <iostream>
#include <string>
#include <fstream>
//This cpp file interface with the program and all the files that stores data
using namespace std;
void writeLines(string lines[], int number_of_lines, string file_name){
	ofstream file_object;
	file_object.open(file_name);
	string line;
	for (int i = 0; i < number_of_lines; i++){
		file_object << lines[i];
	}
	file_object.close();
}
void getNumberOfLinesOnFile(string file_name){
	ifstream file_object;
	file_object.open(file_name);
	int number_of_lines = 0;
	string line;
	while (file_object.eof()){
		getline(file_object, line);
		number_of_lines++;
	}
	file_object.close();
	return number_of_lines;
}
string * loadFileData(int number_of_lines, string file_name){
	string line;
	string file_lines[number_of_lines];
	ifstream file_object;
	file_object.open(file_name);
	int count = 0;
	while (file_object.eof()){
		getline(file_object, line);
		file_lines[count] = line;
		count++;
	}
	file_object.close();
	return file_lines;
}
int getLineLength(string line){
	int count = 0;
	while (line[count] = '\n'){
		count++;
	}
	return count;
}
int findChar(char character, string line){
	int length = getLineLength(line);
	int count = 0;
	while (count < length){
		if (line[count] == ";"){
			return count;
		}
		else{
			count++;
		}
	}
	return -1;
}