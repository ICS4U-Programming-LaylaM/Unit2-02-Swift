//
//  ClassMarks.swift
//
//  Created by Layla Michel
//  Created on 2022-03-31
//  Version 1.0
//  Copyright (c) 2022 IMH. All rights reserved.
//
//  This program calculates the factorial of numbers.

import Foundation

func factorial(integer: Int) -> Int {
    let int = integer
    var factorials: Int

    // Calculate the factorial
    if int == 1 || int == 0 {
        factorials = 1
    } else  {
        factorials = int * factorial(integer: int - 1)
    }

    return factorials
}

while true {
    // Get a number from the user
    print("Enter a number: ", terminator: "")
    let userString = readLine()

    let userInt = Int(userString!) ?? -23847125624345235

    // Check if userInt is an integer or not
    if userInt == -23847125624345235 {
        // Error message if userInt isn't an integer
        print("Please enter a valid integer.\n")
    // Check if userInt is negative
    } else if userInt < 0 {
        print("Number must be greater or equal to 0.\n")
    } else {
        // Call the factorial function
        let fact = factorial(integer: userInt)
        // Print the factorial
        print("\(userInt)" + "! is " + "\(fact)")
        break
    }
}
