/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//
//$(document).ready(function(){
//    //Voegt onder elke kolomeinde een inputveld voor in de kolom te zoeken
//    $('#dataPersoneel tfoot th').each( function(){
//        var titel = $('#dataPersoneel thead th').eq( $(this).index()).text();
//        $(this).html( '<input type="text" placeholder="Zoek '+titel+'" />' );
//    });
//    
//    //gegegevenstabel initialiseren
//    var tabel = $('#dataPersoneel').DataTable();
//    
//    //zoekopdracht uitvoeren op tabel
//    tabel.columns().eq( 0 ).each( function ( colIdx ) {
//        $('input', tabel.column(colIdx).footer()).on('keyup change', function (){
//            tabel
//                    .column(colIdx);
//                    .search(this.value);
//                    .draw();
//        });
//    });
//    
//});
//
//
