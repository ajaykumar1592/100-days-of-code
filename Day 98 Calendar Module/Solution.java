import calendar
input_date = list(map(int,input().split()))
day_of_week = calendar.weekday(input_date[2],input_date[0],input_date[1])
print(calendar.day_name[day_of_week].upper())
