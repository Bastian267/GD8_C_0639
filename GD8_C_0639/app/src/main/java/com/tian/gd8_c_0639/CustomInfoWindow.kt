package com.tian.gd8_c_0639

import kotlinx.android.synthetic.main.layout_tooltip.view.*
import org.osmdorid.views.MapView
import org.osmdroid.views.overlay.Marker
import org.osmdroid.views.overlay.infowindow.Window

class CustomInfoWindow(mapView: MapView?) : InfoWindow(R.layout.layout_tooltip, mapView) {
    override fun  onClose(){
        //by default, do nothing
    }

    override fun onOpen(item: Any){
        val marker = item as Marker
        val infoWindowData = marker.relateObject as ModelMain

        val tvNamaLokasi = mView.tvNamaLokasi
        val tvAlamat = mView.tvAlamat
        val imageClose = mView.imageClose

        tvNamaLokasi.text = infoWindowData.strName
        tvAlamat.text = infoWindowData.strVicinity
        imageClose.setOnClickListener{
            marker.closeInfoWindow()
        }
    }
}