
#!/bin/bash

echo 3 > /sys/class/gpio/export

while true; do
Val=$(cat /sys/class/gpio/gpio3/value)
if [ $Val -eq "1" ]
then 
echo " "
else
echo "                                                                                                                                                    "
echo "                                                                                                                                                    "
echo "DDDDDDDDDDDDD          iiii                                             DDDDDDDDDDDDD                                                               "
echo "D::::::::::::DDD      i::::i                                            D::::::::::::DDD                                                            "
echo "D:::::::::::::::DD     iiii                                             D:::::::::::::::DD                                                          "
echo "DDD:::::DDDDD:::::D                                                     DDD:::::DDDDD:::::D                                                         "
echo "  D:::::D    D:::::D iiiiiii nnnn  nnnnnnnn       ggggggggg   ggggg       D:::::D    D:::::D    ooooooooooo   nnnn  nnnnnnnn       ggggggggg   ggggg"
echo "  D:::::D     D:::::Di:::::i n:::nn::::::::nn    g:::::::::ggg::::g       D:::::D     D:::::D oo:::::::::::oo n:::nn::::::::nn    g:::::::::ggg::::g"
echo "  D:::::D     D:::::D i::::i n::::::::::::::nn  g:::::::::::::::::g       D:::::D     D:::::Do:::::::::::::::on::::::::::::::nn  g:::::::::::::::::g"
echo "  D:::::D     D:::::D i::::i nn:::::::::::::::ng::::::ggggg::::::gg       D:::::D     D:::::Do:::::ooooo:::::onn:::::::::::::::ng::::::ggggg::::::gg"
echo "  D:::::D     D:::::D i::::i   n:::::nnnn:::::ng:::::g     g:::::g        D:::::D     D:::::Do::::o     o::::o  n:::::nnnn:::::ng:::::g     g:::::g "
echo "  D:::::D     D:::::D i::::i   n::::n    n::::ng:::::g     g:::::g        D:::::D     D:::::Do::::o     o::::o  n::::n    n::::ng:::::g     g:::::g "
echo "  D:::::D     D:::::D i::::i   n::::n    n::::ng:::::g     g:::::g        D:::::D     D:::::Do::::o     o::::o  n::::n    n::::ng:::::g     g:::::g "
echo "  D:::::D    D:::::D  i::::i   n::::n    n::::ng::::::g    g:::::g        D:::::D    D:::::D o::::o     o::::o  n::::n    n::::ng::::::g    g:::::g "
echo "DDD:::::DDDDD:::::D  i::::::i  n::::n    n::::ng:::::::ggggg:::::g      DDD:::::DDDDD:::::D  o:::::ooooo:::::o  n::::n    n::::ng:::::::ggggg:::::g "
echo "D:::::::::::::::DD   i::::::i  n::::n    n::::n g::::::::::::::::g      D:::::::::::::::DD   o:::::::::::::::o  n::::n    n::::n g::::::::::::::::g "
echo "D::::::::::::DDD     i::::::i  n::::n    n::::n  gg::::::::::::::g      D::::::::::::DDD      oo:::::::::::oo   n::::n    n::::n  gg::::::::::::::g "
echo "DDDDDDDDDDDDD        iiiiiiii  nnnnnn    nnnnnn    gggggggg::::::g      DDDDDDDDDDDDD           ooooooooooo     nnnnnn    nnnnnn    gggggggg::::::g "
echo "                                                           g:::::g                                                                          g:::::g "
echo "                                               gggggg      g:::::g                                                              gggggg      g:::::g "
echo "                                               g:::::gg   gg:::::g                                                              g:::::gg   gg:::::g "
echo "                                                g::::::ggg:::::::g                                                               g::::::ggg:::::::g" 
echo "                                                 gg:::::::::::::g                                                                 gg:::::::::::::g"  
echo "                                                   ggg::::::ggg                                                                     ggg::::::ggg    "
echo "                                                      gggggg                                                                           gggggg"
fi

sleep .2
done
