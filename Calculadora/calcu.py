from tkinter import *
from tkinter.tix import COLUMN

ventana = Tk()
ventana.title("calculadora")

i = 0
#entrada
e_texto = Entry(ventana,font = ("calibri 20"))
e_texto.grid(row = 0, column = 0,columnspan=4,padx = 5,pady = 5 )


#funciones 
def click_boton(valor):
    global i
    e_texto.insert(i,valor)
    i += 1
    
def borrar ():
    e_texto.delete(0,END)
    i = 0
def hacer_operacion():
    ecuacion = e_texto.get()
    resultado = eval(ecuacion)
    e_texto.delete(0,END)
    e_texto.insert(0,resultado)
    i = 0



#botones 
boton1 = Button (ventana, text = "1", width = 5, height = 2,command=lambda: click_boton(1))
boton2 = Button (ventana, text = "2", width = 5, height = 2,command=lambda: click_boton(2))
boton3 = Button (ventana, text = "3", width = 5, height = 2,command=lambda: click_boton(3))
boton4 = Button (ventana, text = "4", width = 5, height = 2,command=lambda: click_boton(4))
boton5 = Button (ventana, text = "5", width = 5, height = 2,command=lambda: click_boton(5))
boton6 = Button (ventana, text = "6", width = 5, height = 2,command=lambda: click_boton(6))
boton7 = Button (ventana, text = "7", width = 5, height = 2,command=lambda: click_boton(7))
boton8 = Button (ventana, text = "8", width = 5, height = 2,command=lambda: click_boton(8))
boton9 = Button (ventana, text = "9", width = 5, height = 2,command=lambda: click_boton(9))
boton0 = Button (ventana, text = "0", width = 13, height = 2,command=lambda: click_boton(0))

botonBorrar = Button (ventana, text = "AC", width = 5, height = 2,command=lambda:borrar())
botonParentesis1 = Button (ventana, text = "(", width = 5, height = 2,command=lambda: click_boton("("))
botonParentesis2 = Button (ventana, text = ")", width = 5, height = 2,command=lambda: click_boton(")"))
botonPunto = Button (ventana, text = ".", width = 5, height = 2,command=lambda: click_boton("."))

botonDivision = Button (ventana, text = "/", width = 5, height = 2,command=lambda: click_boton("/"))
botonMulti = Button (ventana, text = "x", width = 5, height = 2,command=lambda: click_boton("*"))
botonSuma = Button (ventana, text = "+", width = 5, height = 2,command=lambda: click_boton("+"))
botonResta = Button (ventana, text = "-", width = 5, height = 2,command=lambda: click_boton("-"))
botonigual = Button (ventana, text = "=", width = 5, height = 2,command=lambda: hacer_operacion())



#Agregar botones en pantalla
botonBorrar.grid(row =1 , column = 0, padx = 5, pady =5)
botonParentesis1.grid(row = 1 , column =1 , padx = 5, pady =5)
botonParentesis2.grid(row =1 ,column = 2,padx = 5, pady =5)
botonDivision.grid(row =1, column = 3 , padx = 5 ,pady = 5)

boton7.grid(row = 2, column = 0 , padx = 5 ,pady = 5)
boton8.grid(row = 2, column = 1 , padx = 5 ,pady = 5)
boton9.grid(row = 2, column = 2 , padx = 5 ,pady = 5)
botonMulti.grid(row = 2 ,column = 3,padx = 5,pady = 5)

boton4.grid(row = 3 ,column = 0,padx = 5,pady = 5)
boton5.grid(row = 3 ,column = 1,padx = 5,pady = 5)
boton6.grid(row = 3 ,column = 2,padx = 5,pady = 5)
botonSuma.grid(row = 3 ,column = 3,padx = 5,pady = 5)

boton1.grid(row = 4 ,column = 0,padx = 5,pady = 5)
boton2.grid(row = 4 ,column = 1,padx = 5,pady = 5)
boton3.grid(row = 4 ,column = 2,padx = 5,pady = 5)
botonResta.grid(row = 4 ,column = 3,padx = 5,pady = 5)

boton0.grid(row = 5 ,column = 0,columnspan= 2,padx = 5,pady = 5)
botonPunto.grid(row = 5 ,column = 2,padx = 5,pady = 5)
botonigual.grid(row = 5 ,column = 3,padx = 5,pady = 5)





ventana.mainloop()