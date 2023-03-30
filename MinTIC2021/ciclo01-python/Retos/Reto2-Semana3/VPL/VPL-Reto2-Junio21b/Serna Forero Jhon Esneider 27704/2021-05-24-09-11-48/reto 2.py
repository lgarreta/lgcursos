
Edad     = int (input("Edad: "))
PuntajeEx= int (input("Puntaje: "))
IngresoFlia  = float (input("Ingreso Familiar: "))


                
if  (Edad >= 15 and Edad <=18) :
    DtoEdad = 0.25
    
elif (Edad >= 19 and Edad <= 21) :
    DtoEdad = 0.15
    
elif (Edad >= 22 and Edad <= 25) :
    DtoEdad = 0.10
    
else :
     DtoEdad = 0


if   (IngresoFlia <= 1) :
    DtoIngreso = 0.30
    
elif (IngresoFlia > 1  and IngresoFlia <= 2) :
    DtoIngreso = 0.20
elif  (IngresoFlia > 2  and IngresoFlia <= 3) :
    DtoIngreso = 0.10
elif  (IngresoFlia > 3  and IngresoFlia <= 4) :
    DtoIngreso = 0.05
else :
    DtoIngreso = 0
    
    
if (PuntajeEx >= 80 and PuntajeEx < 86 ) :
    DtoEx = 0.30
elif (PuntajeEx >= 86 and PuntajeEx < 91 ) :
    DtoEx = 0.35
elif (PuntajeEx >= 91 and PuntajeEx < 96 ) :
    DtoEx = 0.40
elif (PuntajeEx >=  96 and PuntajeEx <= 100 ) :
    DtoEx = 0.45
else :
    DtoEx = 0

DtoEdad= int((DtoEdad*100))
DtoIngreso= int((DtoIngreso*100))
DtoEx= int((DtoEx*100))


DtoTotal = ((DtoEdad)+(DtoIngreso)+(DtoEx))

print (DtoEdad)
print (DtoEx)
print (DtoIngreso)
print (DtoTotal)


