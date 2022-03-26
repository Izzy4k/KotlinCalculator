package com.example.cotlincalculator.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.cotlincalculator.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAction()
        initNumber()
        initResult()
    }

    private fun initNumber() {
        binding.oh.setOnClickListener { viewModel.numberOh(binding.txtPrint.text.toString()) }
        binding.one.setOnClickListener { viewModel.numberOne(binding.txtPrint.text.toString()) }
        binding.two.setOnClickListener { viewModel.numberTwo(binding.txtPrint.text.toString()) }
        binding.three.setOnClickListener { viewModel.numberThree(binding.txtPrint.text.toString()) }
        binding.four.setOnClickListener { viewModel.numberFour(binding.txtPrint.text.toString()) }
        binding.five.setOnClickListener { viewModel.numberFive(binding.txtPrint.text.toString()) }
        binding.six.setOnClickListener { viewModel.numberSix(binding.txtPrint.text.toString()) }
        binding.seven.setOnClickListener { viewModel.numberSeven(binding.txtPrint.text.toString()) }
        binding.eight.setOnClickListener { viewModel.numberEight(binding.txtPrint.text.toString()) }
        binding.nine.setOnClickListener { viewModel.numberNine(binding.txtPrint.text.toString()) }
    }

    private fun initAction() {
        binding.Ac.setOnClickListener { viewModel.clear() }
        binding.division.setOnClickListener { viewModel.division() }
        binding.minus.setOnClickListener { viewModel.decrement() }
        binding.plus.setOnClickListener { viewModel.increment() }
        binding.multiplication.setOnClickListener { viewModel.multiplication() }
        binding.plusAndM.setOnClickListener { viewModel.plusOrMinus(binding.txtPrint.text.toString()) }
        binding.proth.setOnClickListener { viewModel.present(binding.txtPrint.text.toString()) }
        binding.isResult.setOnClickListener { viewModel.result() }
        binding.point.setOnClickListener { viewModel.dot(binding.txtPrint.text.toString()) }
    }


    private fun initResult() {
        viewModel.result.observe(
            viewLifecycleOwner
        ) { result -> binding.txtPrint.text = result }
    }

}