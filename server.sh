#Python simple HTTP Server.

OUTPUT="$(ifconfig | grep -Eo 'inet (addr:)?([0-9]*\.){3}[0-9]*' | grep -Eo '([0-9]*\.){3}[0-9]*' | grep -v '127.0.0.1')"
echo "-------------------------------------------------"
echo "Serving folder at http://${OUTPUT}:8000  "
echo "Press Ctrl+C to exit server"
echo "-------------------------------------------------"
python -m SimpleHTTPServer
