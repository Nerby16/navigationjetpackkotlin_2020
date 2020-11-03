package com.example.navigationjetpack.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.navigationjetpack.R
import com.example.navigationjetpack.model.Persona
import kotlinx.android.synthetic.main.fragment_uno.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [UnoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UnoFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_uno, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener{
          /*  val bundle=Bundle()   // con bundle
            bundle.putString("texto", editTextTextPersonName.text.toString())
            Navigation.findNavController(it).navigate(R.id.action_unoFragment_to_dosFragment,bundle)

           */
            // sólo con dato
         //   val directions=UnoFragmentDirections.actionUnoFragmentToDosFragment(dato = editTextTextPersonName.text.toString())
            val persona=Persona("Antonio","dd")

            val directions=UnoFragmentDirections.actionUnoFragmentToDosFragment(dato = editTextTextPersonName.text.toString(),persona)
            Navigation.findNavController(it).navigate(directions)



        }
    }



}