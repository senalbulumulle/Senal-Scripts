## install-unity-desktop.sh

## Remove the Gnome Environment
sudo apt remove gdm 
sudo apt remove ubuntu-desktop
sudo apt remove gnome-shell
sudo apt remove gnome-session
sudo apt remove lightdm 


## Install the Unity Desktop Components 
sudo apt-add-repository
ppa:unity7maintainers/unity7-desktop
sudo apt-get update
sudo apt-get install ubuntu-unity-desktop


## Reboot 
sudo reboot