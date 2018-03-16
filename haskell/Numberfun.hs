k :: String -> Bool
k line = let [a,b,c] = map read$words line 
         in  elem c (l a b)

l :: Double -> Double -> [Double]
l a b = [a+b,a-b,a*b,(a/b),b-a,b/a]

check :: Bool -> String
check True = "Possible"
check False = "Impossible"

out :: [String] -> String
out [] = ""
out (x:xs) = x ++ "\n" ++ out xs


solve :: String -> String
solve text = let (h:ls) = lines text
             in  out (map check (map k$ls))

main :: IO ()
main = interact solve