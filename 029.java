boolean chessBoardCellColor(String cell1, String cell2) {
    boolean celdaColor1 = getColor( cell1 );
    boolean celdaColor2 = getColor( cell2 );

    return celdaColor1 == celdaColor2;
}

boolean getColor ( String celda ){

    int numeroLetra = (int) celda.charAt( 0 );
    int numeroPosicion = Integer.parseInt( String.valueOf( celda.charAt( 1 ) ) );

    if ( numeroLetra % 2 != 0 && numeroPosicion % 2 == 0 ){
        return true;
    }

    if ( numeroLetra % 2 == 0 && numeroPosicion % 2 != 0 ){
        return true;
    }

    return false;
}