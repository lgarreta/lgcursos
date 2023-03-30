from os import get_terminal_size


def agre_benef(lista):
  print("Digite la información del beneficiario a agregar:\n")
  nombre = input()
  cedula =input()
  celular = input()
  if cedula in lista:
    print("El beneficiario ya se en encuentra en la agenda")
  else:
    lista.append(cedula)    
    with open("agenda.txt", "a", encoding = "utf-8") as archivo:
      archivo.write(str(nombre)+"\n")
      archivo.write(str(cedula)+"\n")
      archivo.write(str(celular)+"\n")
    print("El beneficiario ha sido agregado")
  return lista

def imprimir_listado():
  print("Listado de beneficiarios")
  with open("agenda.txt", "r", encoding = "utf-8") as archivo:    
    listado = archivo.read()
  print(listado.rstrip())
  
def bene_por_letra():
    buscar=input("Digite la letra por la que empiezan los beneficiarios:\n")
    print("Listado filtrado de beneficiarios:")
    with open('agenda.txt','r') as read:
        variable= read.readlines()
        
        for linea in variable:
            if linea[0].startswith(buscar):
                print(linea.rstrip())
                indice=variable.index(linea)
                print(variable[indice+1].rstrip())
                print(variable[indice+2].rstrip())
                
def bene_por_nombre_apellido():
    buscar=input("Digite el nombre y apellido del beneficiario a buscar:\n")
    with open('agenda.txt','r') as read:
        variable= read.readlines()
        for linea in variable:
          if linea.rstrip()==buscar.rstrip():
              print(linea.rstrip())
              indice=variable.index(linea)
              print(variable[indice+1].rstrip())
              print(variable[indice+2].rstrip())
              
def borrar_beneficiario_por_cedula():
    cedula=input("Digite la cedula del beneficiario a borrar:\n")
    with open('agenda.txt','r') as read:
        lineas= read.readlines()
        lineasParaEscribir = lineas      
        for linea in lineas:
          if cedula.rstrip() == linea.rstrip():
            indice=lineas.index(linea)            
            lineasParaEscribir.pop(indice-1)            
            lineasParaEscribir.pop(indice-1)
            lineasParaEscribir.pop(indice-1)                        
    with open('agenda.txt','w') as write:
      for linea in lineasParaEscribir:
       write.write(linea)
    print("El usuario ha sido eliminado del listado")   
              

def menu(lista):
  print("Menu Principal")
  print("1. Ver listado")
  print("2. Ver listado filtrado")
  print("3. Agregar beneficiario") 
  print("4. Buscar beneficiario")
  print("5. Borrar beneficiario")
  print("6. Salir")
  
  opcion = int(input())
  
  if opcion == 1:
    imprimir_listado()
  elif opcion == 2:
    bene_por_letra()
  elif opcion == 3:
    lista = agre_benef(lista)
  elif opcion == 4:
    bene_por_nombre_apellido()
  elif opcion == 5:
    borrar_beneficiario_por_cedula() 
  elif opcion == 6:
    print("Hasta pronto")

  return opcion , lista

def main():
  lista=[]
  op = 0
  while op != 6:
    op , lista = menu(lista)
  
main()