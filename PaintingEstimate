using static System.Console;
using System;

namespace PaintingEstimate
{
    class PaintingEstimate
    {
        static void Main(string[] args)
        {
            int roomLength;
            int roomWidth;
            string userInput;

            WriteLine("Enter the length of the room you want to paint (in feet): ");
            userInput = ReadLine();
            roomLength = Convert.ToInt32(userInput);

            WriteLine("Enter the width of the room you want to paint (in feet): ");
            userInput = ReadLine();
            roomWidth = Convert.ToInt32(userInput);

            
            ComputePaintEstimate(roomLength, roomWidth);
          
        } // end main

        //-------------------------------------------------------------------
        public static void ComputePaintEstimate(int roomLength, int roomWidth)
        {
            int squareFeet;
            int length;
            int width;
            int price;

            length = roomLength * 2;
            width = roomWidth * 2;
            squareFeet = length + width * 9;
            price = squareFeet * 6;

            WriteLine("The price of paint required for the job is ${0}", price);
            return;
        } // end method

    } // end class
} // end name space
