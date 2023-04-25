#include <iostream>
#include <string>
using namespace;
string getName(){
	cout << "Enter Name: ";
	string name;
	cin >> name;
	return name;
}
string getSurname(){
	cout << "Enter Surname: ";
	string surname;
	cin >> surname;
	return surname;
}
int getPosition(){
	cout << "Enter your position: " << endl;
	cout << "(1) Doctor" << endl;
	cout << "(2) Nurse" << endl;
	int position_integer;
	cin >> position_integer;
	return position_integer;
}
inte chooseDoctorType(){
	cout << "Choose doctor type: " << endl;
	cout << "(1) General Doctor" << endl;
	cout << "(2) Surgeon"  << endl;
	cout << "(3) Physiotherapist " << endl;
	cout << "(4) Carioproctor" << endl;
	cout << "(5) Dentist" << endl;
	int doctor_type_integer;
	cin >> doctor_type_integer;
	return doctor_type_integer;
} 