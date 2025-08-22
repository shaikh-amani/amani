print("\n1.area of circle\n2.area of trianglr\n3.area of squear\n4,rectangle\n5.exit")
choice=int(input("enter choice:"))
if choice== 1:
r =float(input("enter bradius:"))
print("area of circle:",3.14*r*r)
elif choice==2:
b=float(input("Base:"))
h=float(input("height:"))
print("area of taingle:",0.5*b*h)
elif choice==3:
s=float(input("side:"))
print("area of squer:",s*s)
elif choice==4:
l=float(input("lenght:"))
w=float(input("wighte"))
print("area of ractengle"l*w)
elif choice==5:
break
else:
print("exit:");

