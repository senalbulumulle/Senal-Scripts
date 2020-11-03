## Solve Wifi Issue 
## Written by Senal Bulumulle 
## This script to solve the wifi problem in legacy systems 
## when communicating with the FOIL-EFI

sudo rmmod iwlwifi
sudo modprobe iwlwifi 11n_disable=1

sudo su
echo "options iwlwifi 11n_disable=1" >> /etc/modprobe.d/iwlwifi.conf