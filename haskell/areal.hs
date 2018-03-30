k :: String -> D
k line = 4 * sqrt(read$ line) 

solve :: String -> String
solve text = let (h:ls) = lines text
             in  show (k$h)

main :: IO ()
main = interact solve