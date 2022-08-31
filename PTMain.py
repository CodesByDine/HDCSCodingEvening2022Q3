class PascalTriangle :

	def sumPascalRow(self, n) :
		if (n <= 30) :
			return
		
		print("\n Row ", n ," ")

		sum = (1 << n)
		print(" Sum : ", sum ," ")
	

def main() :
	task = PascalTriangle()

	task.sumPascalRow(5)

	task.sumPascalRow(2)

	task.sumPascalRow(7)

if __name__ == "__main__": main()