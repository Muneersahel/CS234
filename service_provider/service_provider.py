import phonenumbers
from phonenumbers import carrier

mobileNo = input("Enter Mobile Number with country code: ")
service_provider = phonenumbers.parse(mobileNo)
print(carrier.name_for_number(service_provider,"en"))