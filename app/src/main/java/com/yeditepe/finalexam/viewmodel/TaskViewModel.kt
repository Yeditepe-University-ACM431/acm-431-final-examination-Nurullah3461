package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks

    val tasks = mutableListOf(
        Task(1, "Task 1", false),
        Task(2, "Task 2", true)
    )



    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val index = tasks.indexOfFirst { it.id == taskId }
        if (index != -1) {
            val currentTask = tasks[index]
            tasks[index] = currentTask.copy(isCompleted = !currentTask.isCompleted)
        }
    }
}


