function mostrar(id) {
    //Estas son las funciones para mostrar los formularios de las figuras
    if (id === "cuadrado") {
        //Si selecciona el cuadrado
        $("#cuadrado").show();
        $("#rectangulo").hide();
        $("#circulo").hide();
        $("#triangulo").hide();
        $("#calcua").show();
        $("#calrec").hide();
        $("#circ").hide();
        $("#caltri").hide();
    }

    if (id === "rectangulo") {
        //si selecciona el rectangulo muestra el formulario de rectangulo y oculta los demas 
        $("#cuadrado").hide();
        $("#rectangulo").show();
        $("#circulo").hide();
        $("#triangulo").hide();
        $("#calcua").hide();
        $("#calrec").show();
        $("#circ").hide();
        $("#caltri").hide();
    }

    if (id === "circulo") {
        //si selecciona el circulo muestra el formulario de circulo y oculta los demas 
        $("#cuadrado").hide();
        $("#rectangulo").hide();
        $("#circulo").show();
        $("#triangulo").hide();
        $("#calcua").hide();
        $("#calrec").hide();
        $("#circ").show();
        $("#caltri").hide();
    }

    if (id === "triangulo") {
        //si selecciona el triangulo muestra el formulario de triangulo y oculta los demas 
        $("#cuadrado").hide();
        $("#rectangulo").hide();
        $("#circulo").hide();
        $("#triangulo").show();
        $("#calcua").hide();
        $("#calrec").hide();
        $("#caltri").show();
    }
        
}