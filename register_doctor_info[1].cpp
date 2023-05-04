#include "hospital_information_gather.h"
#include <iostream>
#include <string>
using namespace std;
void writeColumnsNames{
	ofstream file_object;
	file_object.open("doctor_info.txt");
	file_object << "Id;Name;Surname;Type_of_Doctor;Wards";
}
void registerDoctor(string id, string name, string surname, string type_of_doctor, string wards){
	//file that stores doctors details on file
	string line;
	line = id+";"+name+";"+surname+";"+type_of_doctor+";"+wards;
	ofstream file_object;
	file_object.open("doctor_info.txt", ios:app);
	file_object << line;
	file_object.close();
}