# **Lab Report 1: Remote Access and FileSystem**

Hello and welcome to my firt lab report for CSE 15L! This lab report will cover basic commands and demonstrate my knowlage of them. 
As a note please don't mind my horrible spelling; spell cheak seems to not exist on this website for some reason.

<br>  

## Let's start with the command `cd` aka change directory.
1. Let's try to use `cd` without any arguments. In this example I will start with my working directory being /home/lecture1.
   
<br> 

![Image](cd1.png)

<br>

> As you can see from the image typing `cd` into the terminal changed the directory path bringing you one directiry "out". This makes
sense because when you type `cd` you're telling the code to change the directory. Without any other instruction, the code takes this as an
intruction to go to the directory "outside" of the currect one. This is what is is expected and therefore no error occured.

<br>  

2. Next let's use a directory as an argument to cd. In this case we will start out with /home being our working directory.

<br>

![Image](cd2.png)

<br>

> In this case we typed `cd lecture1` in order to go into that directory. This makes sense as cd changes the directory so by adding a directory at the end
it will change to that directory. As a note this would only work if we were in the correct directory (ex: if our working directory was /home then `cd README`
would not work if README is in the absalute path /home/lecture1/README if that makes sense). In the specific example screenshotted no errors appeared.

<br>

3. Lastly, we will use `cd` with a file as an argument. This will be from the working directory /home/lecture1/messages.

<br>  

![Image](cd3.png)

<br>  

> For this example, I typed `cd en-us.txt` which is a file in the messages folder in this example. This outputted an error message because the file is not a directory.
This makes sense as cd literally is called change **directory**. 
