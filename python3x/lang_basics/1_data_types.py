"""Data Type"""
"int, float, bool, str, complex"

a = 10
b = 10.5
c = True
d = "string"
e = complex(1, 2)

"Address --> id(), type of object --> type()"
print(id(a))
print(id(b))
print(id(c))
print(id(d))
print(id(e))

print(type(a))
print(type(b))
print(type(c))
print(type(d))
print(type(e))

"in python 3, int is only available for int and long"
f = 12121212121212123332232
print(id(f))
print(type(f))

"""
   int can be represented in four forms
   decimal form(base-10)
   binary form (base-2)
   octal form (base-8)
   hexadecimal form(base-16)
   To represent a number in binary form - Prefix with 0b or 0B
   To represent a number in octal form - Prefix with 0o or 0O
   To represent a number in hex form - Prefix with 0x or 0X
"""
aa = 10
print("binary form of aa=10")
print(bin(aa))
print("octal form of aa=10")
print(oct(aa))
print("hexadecimal form of aa=10")
print(hex(aa))

ab = 0b1111
print("output of ab=0b1111")
print(ab)

ao = 0o123
print("output of ao=0o123")
"1x8(square) + 2x8 + 3x8(power-0) => 64+16+3"
print(ao)

ah = 0x32
print("output of ah = 0x32")
"3x16 + 2x(16 power-0) = 48+2"
print(ah)
